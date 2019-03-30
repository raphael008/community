package com.github.raphael008.enums;

public enum ResultStatus {
    SUCCESS("0000"),
    FAILURE("9999");
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    ResultStatus(String code) {
        this.code = code;
    }
}
