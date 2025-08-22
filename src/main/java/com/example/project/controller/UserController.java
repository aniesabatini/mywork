package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import com.example.project.user.User;
import com.example.project.userService.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

  
 /*   @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    } */
}
