package com.example.project.userService;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.project.repository.UserRepository;
import com.example.project.user.User;




@Service
public class UserService {

	@Autowired
private UserRepository userRepository;
	
	

	public Optional<User> getUserById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	} 




/*	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
*/



/*	public  User addUser(User user) {
		// TODO Auto-generated method stub
		
		return userRepository.save(user);
	}
*/

	

	  

}
