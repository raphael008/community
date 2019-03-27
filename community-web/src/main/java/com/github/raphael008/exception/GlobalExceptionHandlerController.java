package com.github.raphael008.exception;

import com.github.raphael008.common.ApiResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerController {
    @ExceptionHandler(Exception.class)
    public ApiResult handleException() {
        return ApiResult.failure("Internal Error!");
    }
}