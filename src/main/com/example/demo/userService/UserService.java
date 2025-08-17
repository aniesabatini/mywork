package com.example.demo.userService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

//import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.user.User;




@Service
public class UserService {

	 @Autowired
	    private UserRepository userRepository;

	
	

	public Optional<User> getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}




	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}




	public  User addUser(User user) {
		// TODO Auto-generated method stub
		
		return userRepository.save(user);
	}


	

	  

}
