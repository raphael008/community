package com.github.raphael008.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.raphael008.enums.ResultStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult<T> {
    private String code;
    private String message;
    private T data;

    public static ApiResult success() {
        ApiResult result = new ApiResult();
        result.setCode(ResultStatus.SUCCESS.getCode());
        return result;
    }

    public static <T> ApiResult success(T t) {
        ApiResult<T> result = new ApiResult<>();
        result.setCode(ResultStatus.SUCCESS.getCode());
        result.setMessage("");
        result.setData(t);
        return result;
    }

    public static ApiResult failure() {
        ApiResult result = new ApiResult();
        result.setCode(ResultStatus.FAILURE.getCode());
        return result;
    }

    public static <T> ApiResult failure(String error) {
        ApiResult result = new ApiResult();
        result.setCode(ResultStatus.FAILURE.getCode());
        result.setMessage(error);
        return result;
    }
}
