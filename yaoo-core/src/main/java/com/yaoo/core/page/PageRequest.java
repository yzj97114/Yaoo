package com.yaoo.core.page;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yyyzj
 * @version V1.0
 * @Package com.yaoo.core.page
 * @date 2019/12/28 18:32
 * @Copyright 792826371@qq.com
 * 分页请求参数封装
 */
@Data
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum = 1;
    /**
     * 每页数量
     */
    private int pageSize = 10;

    /**
     * 查询参数
     */
    private Map<String, Object> params = new HashMap<>();


}
