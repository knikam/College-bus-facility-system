package com.Cognizant.Bus.Facility.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cognizant.Bus.Facility.System.model.Route;

public interface routeRepository extends JpaRepository<Route,Integer> {
	
}
