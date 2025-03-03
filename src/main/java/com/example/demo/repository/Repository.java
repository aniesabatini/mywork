package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.*;


public interface Repository extends JpaRepository<User, Long> {
	}


