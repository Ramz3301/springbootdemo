package com.ramz.springbootdemo.controller;

import com.ramz.springbootdemo.model.User;
import com.ramz.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    public String findAll() {
        List<User> users = userService.findAll();

        return "";
    }
}
