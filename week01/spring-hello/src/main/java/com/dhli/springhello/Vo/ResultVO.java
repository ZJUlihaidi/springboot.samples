package com.dhli.springhello.Vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;

    private ResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(200, "success", data);
    }
}