package com.jwt.auth.service;

import com.jwt.auth.model.mySql.User;
import com.jwt.auth.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findByEmail(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
