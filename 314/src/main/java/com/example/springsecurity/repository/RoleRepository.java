package com.example.springsecurity.repository;

import com.example.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query(name = "Roles.findListRoles", value = "from Role r where r.roleName in (:roles)")
    List<Role> findRolesByRolenamesArray(@Param("roles") String[] roles);
}
