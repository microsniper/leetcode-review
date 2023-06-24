package com.sniper.leetcodereview.common;


/**
 * @Description TODO
 * @Date 2022-01-28
 * @Author sniper
 */
public class ResultWrap {
    private static final Boolean SUCCESS = true;
    private static final Boolean FAIL = false;
    private ResultWrap(){}

    public static <T> Result<T> getSuccess(T data){
        return new Result<T>(SUCCESS, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),data);
    }

    public static <T> Result<T> getSuccess(){
        return new Result<T>(SUCCESS, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
    }

    public static <T> Result<T> getSuccess(String message, T data){
        return new Result<T>(SUCCESS, ResultCode.SUCCESS.getCode(),message,data);
    }

    public static <T> Result<T> getFail(){
        return new Result<T>(FAIL, ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(),null);
    }

    public static <T> Result<T> getFail(String message){
        return new Result<T>(FAIL, ResultCode.FAILED.getCode(),message,null);
    }

    public static <T> Result<T> getFail(Integer code, String message){
        return new Result<T>(FAIL,code,message);
    }

    public static <T> Result<T> getFail(Integer code, String message,T data){
        return new Result<T>(FAIL,code,message,data);
    }

    public static <T> Result<T> getFail(ResultCode resultCode){
        return new Result<T>(FAIL,resultCode.getCode(),resultCode.getMessage());
    }

    public static <T> Result<T> getFail(IErrorCode errorCode){
        return new Result<T>(FAIL,errorCode.getCode(),errorCode.getMessage(),null);
    }

    public static <T> Result<T> validateFailed(String message){
        return new Result<T>(FAIL, ResultCode.ILLEGAL_PARAMETER.getCode(),message,null);
    }
}
