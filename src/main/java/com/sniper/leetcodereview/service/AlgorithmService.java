package com.sniper.leetcodereview.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sniper.leetcodereview.common.Result;
import com.sniper.leetcodereview.entity.Algorithm;
import com.sniper.leetcodereview.entity.dto.AlgorithmDTO;

public interface AlgorithmService extends IService<Algorithm> {

    Result<IPage<Algorithm>> List(AlgorithmDTO algorithm);

    Result add(Algorithm algorithm);

    Result<Algorithm> getOneById(Integer algorithmId);

    Result<String> del(Integer algorithmId);

    Result<Algorithm> findOne(String topic);

    Result<Algorithm> findOneByOrder();
}
