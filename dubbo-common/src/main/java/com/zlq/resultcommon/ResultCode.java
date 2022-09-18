package com.zlq.resultcommon;

/**
 * @author zhaolengquan
 */

public enum ResultCode {
    //操作成功
    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败");



    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
