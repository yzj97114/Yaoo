package com.yaoo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yyyzj
 * @version V1.0
 * @Package com.yaoo.controller
 * @date 2019/12/26 21:23
 * @Copyright 792826371@qq.com
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello,yaoo!";
    }
}
