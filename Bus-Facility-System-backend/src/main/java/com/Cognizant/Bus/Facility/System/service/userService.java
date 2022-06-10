package com.Cognizant.Bus.Facility.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Cognizant.Bus.Facility.System.model.User;
import com.Cognizant.Bus.Facility.System.repository.userRepository;

@Service
public class userService{

	@Autowired
	private userRepository repository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public ResponseEntity<String> createUser(User user){
		
		user.setPassword(getEncodedPassword(user.getPassword()));
		User userData = repository.save(user);
		
		if(userData != null) {
			return new ResponseEntity<String>("User added",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Fail to add user",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<User>> getUserByType(String type){
		List<User> users = repository.findByUserType(type);
		if(users.size()>0) {
			return ResponseEntity.ok(users);
		}else {
			return new ResponseEntity<>(users,HttpStatus.NOT_FOUND);
		}
	}
	
	public String getEncodedPassword(String password) {
		return passwordEncoder.encode(password);
	}

}
