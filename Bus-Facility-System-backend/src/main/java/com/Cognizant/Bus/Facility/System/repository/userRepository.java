package com.Cognizant.Bus.Facility.System.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cognizant.Bus.Facility.System.model.User;

public interface userRepository extends JpaRepository<User, Long>{
	public List<User> findByUserType(String type);
	public User findByEmail(String email);
}
