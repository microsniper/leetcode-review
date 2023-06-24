package com.sniper.leetcodereview.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/6/18 3:00 PM
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@TableName("algorithm")
public class Algorithm {

    @TableId
    private Integer algorithmId;
    /**
     * 题目
     */
    private String topic;

    /**
     * 难度
     */
    private String difficulty;

    /**
     * 题目描述
     */
    private String content;

    /**
     * 示例
     */
    private String example;

    /**
     * 提示
     */
    private String tip;

    /**
     * 返回值
     */
    private String result;

    /**
     * 参数
     */
    private String param;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
