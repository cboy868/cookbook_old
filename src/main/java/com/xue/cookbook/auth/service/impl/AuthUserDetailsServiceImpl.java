package com.xue.cookbook.auth.service.impl;

import com.xue.cookbook.auth.dao.AuthUserDetailsMapper;
import com.xue.cookbook.auth.model.AuthUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthUserDetailsServiceImpl{

    @Autowired
    private AuthUserDetailsMapper authUserDetailsMapper; 

    public AuthUserDetails findByUserName(String username) {
        return authUserDetailsMapper.findByUserName(username);
    }
    
}