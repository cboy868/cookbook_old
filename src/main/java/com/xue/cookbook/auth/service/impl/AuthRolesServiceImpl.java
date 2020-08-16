package com.xue.cookbook.auth.service.impl;

import java.util.List;

import com.xue.cookbook.auth.dao.AuthRolesMapper;
import com.xue.cookbook.auth.model.AuthRoles;
import com.xue.cookbook.auth.service.AuthRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthRolesServiceImpl implements AuthRoleService {

    @Autowired
    AuthRolesMapper authRolesMapper;

    @Override
    public List<AuthRoles> list() {
        return authRolesMapper.selectAll();
    }

    @Override
    public int insert(AuthRoles record) {
        return authRolesMapper.insert(record);
    }

    @Override
    public AuthRoles selectByPrimaryKey(Integer id) {
        return authRolesMapper.selectByPrimaryKey(id);
    }
    
}