package com.sniper.leetcodereview.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sniper.leetcodereview.common.Result;
import com.sniper.leetcodereview.common.ResultWrap;
import com.sniper.leetcodereview.entity.Algorithm;
import com.sniper.leetcodereview.entity.dto.AlgorithmDTO;
import com.sniper.leetcodereview.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/6/18 2:58 PM
 **/
@RestController
public class AlgorithmController {

    @Autowired
    private AlgorithmService algorithmService;


    @GetMapping("/findOne")
    public Result<Algorithm> findOne(String topic){
        return algorithmService.findOne(topic);
    }

    public Result<Algorithm> findOneByOrder(){
        return algorithmService.findOneByOrder();
    }

    @PostMapping("list")
    public Result<IPage<Algorithm>> List(@RequestBody @Validated AlgorithmDTO algorithm){
        return algorithmService.List(algorithm);
    }

    @PostMapping("add")
    public Result add(@RequestBody Algorithm algorithm){
        return algorithmService.add(algorithm);
    }

    @GetMapping("/getOneById/{algorithmId}")
    public Result<Algorithm> getOneById(@PathVariable("algorithmId") Integer algorithmId){
        return algorithmService.getOneById(algorithmId);
    }

    @PostMapping("/update")
    public Result<Algorithm> getOneById(@RequestBody @Validated Algorithm algorithm){
        algorithmService.updateById(algorithm);
        return ResultWrap.getSuccess();
    }

    @DeleteMapping("/del/{algorithmId}")
    public Result<String> del(@PathVariable("algorithmId") Integer algorithmId){
        return algorithmService.del(algorithmId);
    }
}
