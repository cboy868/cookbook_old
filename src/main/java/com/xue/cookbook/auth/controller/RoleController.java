package com.xue.cookbook.auth.controller;

import java.util.List;

import com.xue.cookbook.auth.model.AuthRoles;
import com.xue.cookbook.auth.service.AuthRoleService;
import com.xue.cookbook.core.utils.JsonData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pri/auth_role")
public class RoleController {

    @Autowired
    AuthRoleService authRoleService;

    @RequestMapping("list")
    public JsonData list() {
        List<AuthRoles> list = authRoleService.list();
        return JsonData.success(list);
    }


    @RequestMapping("save")
    public JsonData insert() {
        // AuthRoles authRoles = new AuthRoles();
        // authRoles.setId(2);
        // authRoles.setName("管理员");
        // Integer id = authRoleService.insert(authRoles);


        return JsonData.success();

    }
}