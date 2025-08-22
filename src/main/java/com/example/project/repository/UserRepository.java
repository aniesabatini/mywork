package com.example.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.user.User;

//import com.example.project.user.*;


public interface UserRepository extends JpaRepository<User, Long> {

//	public User findByUserId(Long id);
	
 
    


//public	Optional<User> findById(int id);
	
	}


