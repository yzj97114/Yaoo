package com.yaoo.controller;

import com.yaoo.core.http.HttpResult;
import com.yaoo.core.page.PageRequest;
import com.yaoo.entity.SysUser;
import com.yaoo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 79282
 */
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findAll")
    public List<SysUser> findAll() {
        return sysUserService.findAll();
    }

    @GetMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {

        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }
}
