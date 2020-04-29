package com.jwt.auth.dao;

import com.jwt.auth.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    User findByName(String name);
}
