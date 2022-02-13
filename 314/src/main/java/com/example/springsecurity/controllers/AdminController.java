package com.example.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class AdminController {

    @GetMapping("/main")
    public String getAllUsersREST() {
        return "main";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}