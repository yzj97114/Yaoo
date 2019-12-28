package com.yaoo.core.service;

import com.yaoo.core.page.PageRequest;
import com.yaoo.core.page.PageResult;

import java.util.List;

/**
 * @author yyyzj
 * @version V1.0
 * @Package com.yaoo.core.service
 * @date 2019/12/28 18:28
 * @Copyright 792826371@qq.com
 * 通用CURD接口
 */
public interface CurdService<T> {
    /**
     * 保存操作
     * @param record
     * @return
     */
    int save(T record);

    /**
     * 删除操作
     *
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 批量删除操作
     *
     * @param records
     * @return
     */
    int delete(List<T> records);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    PageResult findPage(PageRequest pageRequest);
}
