package com.wunai.result;

import lombok.Data;

@Data
public class Result<T> {
    private String code;
    private String message;
    private T result;

    public Result() {
    }

    public Result(ErrorCode code, String message, T result) {
        this.code = code.getCode();
        this.message = message;
        this.result = result;
    }

    public Result(String code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public Result(ErrorCode code, String message) {
        this.code = code.getCode();
        this.message = message;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(T result) {
        this.result = result;
        this.code = ErrorCode.EC200.getCode();
    }
}
