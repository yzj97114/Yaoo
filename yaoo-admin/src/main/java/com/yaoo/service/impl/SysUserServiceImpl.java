package com.yaoo.service.impl;

import com.yaoo.core.page.MybatisPageHelper;
import com.yaoo.core.page.PageRequest;
import com.yaoo.core.page.PageResult;
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



    @Override
    public int save(SysUser record) {
        return 0;
    }

    @Override
    public int delete(SysUser record) {
        return 0;
    }

    @Override
    public int delete(List<SysUser> records) {
        return 0;
    }

    @Override
    public SysUser findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest,sysUserMapper);
    }
}
