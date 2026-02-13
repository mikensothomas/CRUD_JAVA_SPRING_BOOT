package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.UserService;
import com.example.demo.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}