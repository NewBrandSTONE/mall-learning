package com.young.mall.portal.common.api;

import lombok.Data;

/**
 * 通用返回对象
 *
 * @author jonesleborn
 * @since topic v1.0
 */
@Data
public class CommonResult<T> {

    private long code;
    private String message;
    private T data;

    protected CommonResult() {

    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), message, data);
    }


    public static <T> CommonResult<T> failure(IErrorCode errorCode) {
        return new CommonResult<>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    public static <T> CommonResult<T> failure(String errorMessage) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), errorMessage, null);
    }

    public static <T> CommonResult<T> failure() {
        return failure(ResultCode.FAILED);
    }
}
