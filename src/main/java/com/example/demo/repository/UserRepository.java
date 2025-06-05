package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.*;


public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long id);
	
 
    


	//Optional<User> findById(int id);
	
	}


