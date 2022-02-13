package com.example.springsecurity.config;

import com.example.springsecurity.model.Role;
import com.example.springsecurity.model.User;
import com.example.springsecurity.service.RoleService;
import com.example.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class TestDB {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public TestDB(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void insertData() {
        Role roleAdmin = new Role("ROLE_ADMIN");
        roleService.addNewRole(roleAdmin);
        Role roleUser = new Role("ROLE_USER");
        roleService.addNewRole(roleUser);

        User user1 = new User("ADMIN", "SURNAME", "ADMIN", "1@test.com", "111", Set.of(roleAdmin));
        userService.create(user1);

        User user2 = new User("USER", "SURNAME", "USER", "2@test.com", "222", Set.of(roleUser));
        userService.create(user2);
    }
}