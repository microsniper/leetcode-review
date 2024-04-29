package com.sniper.leetcodereview.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sniper.leetcodereview.common.Result;
import com.sniper.leetcodereview.common.ResultCode;
import com.sniper.leetcodereview.common.ResultWrap;
import com.sniper.leetcodereview.common.exception.BaseException;
import com.sniper.leetcodereview.common.service.RedisService;
import com.sniper.leetcodereview.entity.Algorithm;
import com.sniper.leetcodereview.entity.dto.AlgorithmDTO;
import com.sniper.leetcodereview.mapper.AlgorithmMapper;
import com.sniper.leetcodereview.service.AlgorithmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/6/18 3:08 PM
 **/
@Service
public class AlgorithmServiceImpl extends ServiceImpl<AlgorithmMapper, Algorithm> implements AlgorithmService {

    private static String ALGORITHM_KEY = "algorithm:id";
    @Resource
    private RedisService redisService;


    @Override
    public Result<IPage<Algorithm>> List(AlgorithmDTO algorithm) {

        IPage<Algorithm> page = new Page<>(algorithm.getPageNum(),algorithm.getPageSize(),true);
        LambdaQueryWrapper<Algorithm> query = new LambdaQueryWrapper<>();
        if (StrUtil.isNotEmpty(algorithm.getTopic())){
            query.like(Algorithm::getTopic,algorithm.getTopic());
        }
        if (StrUtil.isNotEmpty(algorithm.getDifficulty())){
            query.eq(Algorithm::getDifficulty,algorithm.getDifficulty());
        }
        query.orderByAsc(Algorithm::getCreateTime);
        IPage<Algorithm> iPage = this.page(page, query);
        if (CollectionUtil.isNotEmpty(iPage.getRecords())){
            List<Algorithm> records = iPage.getRecords();
            for (Algorithm record : records) {
                record.setContent(record.getContent().replace("\n","</br>"));
                record.setExample(record.getExample().replace("\n","</br>"));
                record.setTip(record.getTip().replace("\n","</br>"));
                record.setRemark(record.getRemark().replace("\n","</br>"));
            }
        }
        return ResultWrap.getSuccess(iPage);
    }

    @Override
    public Result add(Algorithm algorithm) {
        algorithm.setCreateTime(new Date());
        algorithm.setUpdateTime(new Date());
        baseMapper.insert(algorithm);
        return ResultWrap.getSuccess();
    }

    @Override
    public Result<Algorithm> getOneById(Integer algorithmId) {
        Algorithm algorithm = baseMapper.selectById(algorithmId);
        return ResultWrap.getSuccess(algorithm);
    }

    @Override
    public Result<String> del(Integer algorithmId) {
        Algorithm algorithm = baseMapper.selectById(algorithmId);
        if (ObjectUtil.isEmpty(algorithm)){
            return ResultWrap.getFail(ResultCode.ILLEGAL_PARAMETER);
        }
        baseMapper.deleteById(algorithmId);
        return ResultWrap.getSuccess(algorithm.getTopic());
    }

    @Override
    public Result<Algorithm> findOne(String topic) {
        LambdaQueryWrapper<Algorithm> query = new LambdaQueryWrapper<>();
        if (StrUtil.isNotEmpty(topic)){
            query.like(Algorithm::getTopic,topic);
        }
        List<Algorithm> algorithmList = baseMapper.selectList(query);
        if (CollectionUtil.isNotEmpty(algorithmList)){
            int i = RandomUtil.randomInt(0, algorithmList.size());
            return ResultWrap.getSuccess(algorithmList.get(i));
        }
        return ResultWrap.getSuccess();
    }

    @Override
    public Result<Algorithm> findOneByOrder() {
        Integer pageNum = (Integer)redisService.get(ALGORITHM_KEY);

        pageNum = Optional.ofNullable(pageNum).orElse(1);
        Page<Algorithm> page = new Page<>(pageNum,1);
        LambdaQueryWrapper<Algorithm> query = new LambdaQueryWrapper<>();
        List<Algorithm> algorithmList = baseMapper.selectPage(page, query).getRecords();


        Algorithm algorithm = Optional.ofNullable(algorithmList)
                .map(l -> l.stream().findFirst().orElseGet(() -> null))
                .orElseGet(() -> null);

        Long count = baseMapper.selectCount(query);
        if (++pageNum > count){
            pageNum = 1;
        }
        redisService.set(ALGORITHM_KEY,pageNum);
        return ResultWrap.getSuccess(algorithm);
    }
}
