package com.xue.cookbook.auth.service;

import java.util.List;

import com.xue.cookbook.auth.model.AuthRoles;

public interface AuthRoleService {
    
    List<AuthRoles> list();

    int insert(AuthRoles record);

    AuthRoles selectByPrimaryKey(Integer id);
}