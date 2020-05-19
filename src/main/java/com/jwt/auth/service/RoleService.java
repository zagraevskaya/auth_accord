package com.jwt.auth.service;

import com.jwt.auth.model.mySql.Role;
import com.jwt.auth.model.RoleDto;

import java.util.List;

public interface RoleService {

    Role save(RoleDto role);
    List<Role> findAll();
    void delete(int id);

    Role findOne(String name);

    Role findById(int id);

    RoleDto update(RoleDto roleDto);
}
