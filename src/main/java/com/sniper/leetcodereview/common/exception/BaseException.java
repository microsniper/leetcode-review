package com.sniper.leetcodereview.common.exception;

import lombok.Data;

/**
 * @Description
 * @Author sniper
 * @Date 2024/4/29 11:41 AM
 **/
@Data
public class BaseException extends RuntimeException{
    private static final long serialVersionUID = -1121241486336615812L;

    private Integer status;
    private String message;
    private Boolean success;

    public BaseException(String message){
        this.status = 1001;
        this.success = false;
        this.message = message;
    }
}
