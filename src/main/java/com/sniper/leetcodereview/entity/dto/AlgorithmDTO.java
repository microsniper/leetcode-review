package com.sniper.leetcodereview.entity.dto;

import lombok.*;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/6/18 3:00 PM
 **/
@Builder
@Data
public class AlgorithmDTO {

    private String topic;

    private String difficulty;

    private Integer pageNum;

    private Integer pageSize;

}
