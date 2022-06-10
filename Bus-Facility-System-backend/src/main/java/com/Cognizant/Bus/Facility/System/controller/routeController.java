package com.Cognizant.Bus.Facility.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Cognizant.Bus.Facility.System.model.Route;
import com.Cognizant.Bus.Facility.System.service.routeService;

@RestController
public class routeController {
	
	@Autowired
	private routeService service;
	
	@PostMapping("/addRoute")
	public ResponseEntity<String> addRoute(@RequestBody Route route){
		return service.addRoute(route);
	}
	
	@GetMapping("/getRoute")
	public ResponseEntity<List<Route>> getRoute(){
		return service.getRoute();
	}
	
	@GetMapping("/getRouteById")
	public ResponseEntity<Route> getRouteById(@RequestParam(name="id") int id){
		return service.getRouteById(id);
	}
}
