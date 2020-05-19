package com.jwt.auth.controller;

import com.jwt.auth.model.*;
import com.jwt.auth.model.mySql.Role;
import com.jwt.auth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ApiResponse<List<Role>> listRole(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",roleService.findAll());
    }

    @PostMapping
    public ApiResponse<Role> saveRole(@RequestBody RoleDto role){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",roleService.save(role));
    }


    @GetMapping("/{id}")
    public ApiResponse<Role> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",roleService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<UserDto> update(@RequestBody RoleDto roleDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",roleService.update(roleDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        roleService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }

}
