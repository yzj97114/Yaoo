package com.yaoo.service;

import com.yaoo.core.service.CurdService;
import com.yaoo.entity.SysUser;

import java.util.List;

/**
 * @author 79282
 */
public interface SysUserService extends CurdService<SysUser> {
    /**
     * 查找全部用户
     * @return
     */
    List<SysUser> findAll();
}
