package com.example.springsecurity.service;

import com.example.springsecurity.model.Role;
import com.example.springsecurity.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Set<Role> getRolesByName(String[] roles) {
        return new HashSet<Role>(roleRepository.findRolesByRolenamesArray(roles));
    }
    @Override
    public void addNewRole(Role role) {
         roleRepository.save(role);
    }

}
