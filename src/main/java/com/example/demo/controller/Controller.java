package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.repository.*;
import com.example.demo.user.*;
import com.example.demo.userService.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {

	@Autowired
    private UserService userService; // Use proper naming conventions

    
 
   
    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
    	return userService.getUserById(id);
    }
    
    @GetMapping
    public List<User> getAllUsers() {
    	return userService.getAllUsers();
    }
    
    @PostMapping
    public User createUser(@RequestBody User user) {
    	
			return userService.addUser(user);
		
    }

}

