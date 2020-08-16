package com.xue.cookbook.auth.dao;

import com.xue.cookbook.auth.model.AuthUserDetails;

public interface AuthUserDetailsMapper {
    AuthUserDetails findByUserName(String username);
}
