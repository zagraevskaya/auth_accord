package com.jwt.auth.dao;

import com.jwt.auth.model.Role;
import com.jwt.auth.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByRole(String name);
}

