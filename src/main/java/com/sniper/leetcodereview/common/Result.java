package com.sniper.leetcodereview.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Date 2022-01-28
 * @Author sniper
 */
@Data
@NoArgsConstructor
public class Result<T> {
    private T data;
    private Integer status;
    private String message;
    private Boolean success;

    public Result(String message){
        this.message = message;
    }
    public Result(Boolean success,Integer status,String message){
        this.success = success;
        this.status = status;
        this.message =message;
    }

    public Result(Boolean success,Integer status,String message,T data){
        this.success = success;
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
