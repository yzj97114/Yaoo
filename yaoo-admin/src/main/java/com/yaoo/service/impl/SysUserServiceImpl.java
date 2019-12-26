package com.yaoo.service.impl;

import com.yaoo.dao.SysUserMapper;
import com.yaoo.entity.SysUser;
import com.yaoo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 79282
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
