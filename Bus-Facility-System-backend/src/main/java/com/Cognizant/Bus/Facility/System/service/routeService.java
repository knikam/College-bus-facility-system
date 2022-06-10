package com.Cognizant.Bus.Facility.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Cognizant.Bus.Facility.System.model.Route;
import com.Cognizant.Bus.Facility.System.repository.routeRepository;

@Service
public class routeService {
	
	@Autowired
	private routeRepository repository;
	
	public ResponseEntity<String> addRoute(Route route){
		
		Route resRoute = repository.save(route);
		
		if(resRoute != null) {
			return new ResponseEntity<String>("New route added with Id "+resRoute.getId(), HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Fail to add route", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Route>> getRoute(){
		
		List<Route> routes = repository.findAll();
		
		if(routes.size()>0) {
			return ResponseEntity.ok(routes);
		}else {
			return new ResponseEntity<>(routes,HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<Route> getRouteById(int id){
		
		Route route = repository.findById(id).orElse(null);
		
		if(route != null) {
			return ResponseEntity.ok(route);
		}else {
			return new ResponseEntity<>(route,HttpStatus.NOT_FOUND);
		}
	}
}
