package com.yaoo.core.http;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author yyyzj
 * @version V1.0
 * @Package com.yaoo.core.http
 * @date 2019/12/28 18:52
 * @Copyright 792826371@qq.com
 */
@Data
public class HttpResult<T> {
    private int code = 200;
    private String msg;
    private T data;

    public static HttpResult error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static HttpResult error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static HttpResult error(int code, String msg) {
        HttpResult r = new HttpResult();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static HttpResult ok(String msg) {
        HttpResult r = new HttpResult();
        r.setMsg(msg);
        return r;
    }

    public static HttpResult ok(Object data) {
        HttpResult r = new HttpResult();
        r.setData(data);
        return r;
    }

    public static HttpResult ok() {
        return new HttpResult();
    }

}
