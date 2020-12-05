package com.example.springrestjm.controller;

import com.example.springrestjm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminControllet {

    @Autowired
    UserService userService;

    //Success +
    @GetMapping("login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("user")
    public String user() {
        return "user";
    }
}
