package com.yaoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Package com.yaoo
 * @author yyyzj
 * @date 2019/12/26 21:26
 * @version V1.0
 * @Copyright 792826371@qq.com
 */
@SpringBootApplication
@MapperScan("com.yaoo.dao")
public class YaooApplication {

    public static void main(String[] args) {
        SpringApplication.run(YaooApplication.class, args);
    }

}
