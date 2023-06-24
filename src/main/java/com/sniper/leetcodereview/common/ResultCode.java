package com.sniper.leetcodereview.common;

/**
 * @Description
 * @Date 2022-01-28
 * @Author sniper
 */
public enum  ResultCode implements IErrorCode {
    //success
    SUCCESS(1000,"执行成功"),

    //common error
    FAILED(1001,"操作失败"),
    ILLEGAL_PARAMETER(1002,"参数不合法");

    private int code;
    private String message;

    ResultCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }


    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
