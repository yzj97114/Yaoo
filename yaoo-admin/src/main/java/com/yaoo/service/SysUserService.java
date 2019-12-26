package com.yaoo.service;

import com.yaoo.entity.SysUser;

import java.util.List;

/**
 * @author 79282
 */
public interface SysUserService {
    /**
     * 查找全部用户
     * @return
     */
    List<SysUser> findAll();
}
