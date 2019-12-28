package com.yaoo.core.page;

import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * @author yyyzj
 * @version V1.0
 * @Package com.yaoo.core.page
 * @date 2019/12/28 18:34
 * @Copyright 792826371@qq.com
 * 分页结果封装
 */
@Data
public class PageResult<T> {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 总条数
     */
    private Long totalSize;
    /**
     * 总页数
     */
    private int totalPages;
    /**
     * 响应结果
     */
    private T data;

}
