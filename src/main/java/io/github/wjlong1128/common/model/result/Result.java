package io.github.wjlong1128.common.model.result;

import java.io.Serializable;

/*
 * @author Wang Jianlong
 * @version 1.0.0
 * @description
 * @date 2023/4/3
 */
public class Result<T> implements Serializable {

    private Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private int code;
    private String message;

    private T data;


}
