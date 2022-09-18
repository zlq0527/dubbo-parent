package com.zlq.resultcommon;

import lombok.Data;

@Data
public class ResultData<T> {
    private int code;
    private String message;
    private T data;

    public ResultData<T> success(T data) {
        ResultData<T> resultData = new ResultData();
        resultData.setCode(ResultCode.SUCCESS.getCode());
        resultData.setMessage(ResultCode.SUCCESS.getMessage());
        resultData.setData(data);
        return resultData;
    }

    public ResultData<T> fail(int code, String message) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(code);
        resultData.setMessage(message);
        return resultData;
    }
}
