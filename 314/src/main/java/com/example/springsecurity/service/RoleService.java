package com.example.springsecurity.service;

import com.example.springsecurity.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> getRoles();
    Set<Role> getRolesByName(String[] roles);
    void addNewRole(Role role);
}
