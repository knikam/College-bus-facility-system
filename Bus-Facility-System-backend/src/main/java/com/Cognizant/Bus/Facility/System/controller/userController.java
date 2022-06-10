package com.Cognizant.Bus.Facility.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Cognizant.Bus.Facility.System.model.User;
import com.Cognizant.Bus.Facility.System.service.userService;

@RestController
@CrossOrigin("*")
public class userController {

	@Autowired
	private userService service;
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody User user){
		return service.createUser(user);
	}
	
	@GetMapping("/getUserByType")
	public ResponseEntity<List<User>> getUserByType(@RequestParam(name="type") String type){
		return service.getUserByType(type);
	}
	
}
