package com.example.springsecurity.repository;

import com.example.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(name = "Username.findWithRoles", value = "from User u JOIN FETCH u.roles where u.username = :username")
    User findByUsername(@Param("username") String username);

    @Query(name = "Email.findWithRoles", value = "from User u JOIN FETCH u.roles where u.email = :email")
    User findByEmail(@Param("email") String email);

}