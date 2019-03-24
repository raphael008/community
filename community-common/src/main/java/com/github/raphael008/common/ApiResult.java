package com.github.raphael008.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResult<T> {
    private String code;
    private String message;
    private T data;

    public static <T> ApiResult<T> success(T t) {
        ApiResult<T> result = new ApiResult<>();
        result.setCode("0000");
        result.setMessage("");
        result.setData(t);
        return result;
    }

    public static <T> ApiResult<T> failure(String error) {
        ApiResult<T> result = new ApiResult<>();
        result.setCode("9999");
        result.setMessage(error);
        return result;
    }
}
