package com.xue.cookbook.auth.dao;

import com.xue.cookbook.auth.model.AuthRoleUsersRel;
import java.util.List;

public interface AuthRoleUsersRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role_users_rel
     *
     * @mbg.generated
     */
    int insert(AuthRoleUsersRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role_users_rel
     *
     * @mbg.generated
     */
    List<AuthRoleUsersRel> selectAll();
}