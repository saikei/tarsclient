package com.huya.taftest.common;

import java.io.Serializable;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
public class Result<T> implements Serializable {
    private T data;
    private int code;
    private String requestId;
    private String message = "";

    public Result(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result(data, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
        return result;
    }

    public static Result success() {
        Result result = new Result((Object)null, ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
        return result;
    }

    public static <T> Result<T> fail(ResultCode resultCode) {
        Result<T> result = new Result((Object)null, resultCode.getCode(), resultCode.getMessage());
        return result;
    }

    public static <T> Result<T> fail(T data, ResultCode resultCode) {
        Result<T> result = new Result(data, resultCode.getCode(), resultCode.getMessage());
        return result;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return this.code == 0;
    }
}
