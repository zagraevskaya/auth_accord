package com.jwt.auth.service.impl;

import com.jwt.auth.dao.RoleDao;
import com.jwt.auth.dao.UserDao;
import com.jwt.auth.model.Role;
import com.jwt.auth.model.RoleDto;
import com.jwt.auth.model.User;
import com.jwt.auth.service.RoleService;
import com.jwt.auth.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "roleService")
public class RoleServiceImpl implements  RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role save(RoleDto role) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        List<Role> list = new ArrayList<>();
        roleDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(int id) {
        roleDao.deleteById(id);
    }

    @Override
    public Role findOne(String name) {
        return roleDao.findByRole(name);
    }

    @Override
    public Role findById(int id) {
        Optional<Role> optionalRole = roleDao.findById(id);
        return optionalRole.isPresent() ? optionalRole.get() : null;
    }

    @Override
    public RoleDto update(RoleDto roleDto) {
        Role role = findById(roleDto.getRoleId());
        if(role != null) {
            BeanUtils.copyProperties(roleDto, role, "password", "username");
            roleDao.save(role);
        }
        return roleDto;
    }
}
