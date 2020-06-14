package com.young.mall.portal.common.api;

import lombok.Getter;

/**
 * 枚举返回码
 *
 * @author jonesleborn
 * @since topic v1.0
 */
@Getter
public enum ResultCode implements IErrorCode {

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数校验失败"),
    UNAUTHORIZED(401, "授权校验失败"),
    FORBIDDEN(403, "缺少访问权限");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

}
