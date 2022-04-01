package com.test.restaurantservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.restaurantservice.model.Restaurants;
import com.test.restaurantservice.service.RestaurantsService;

@RestController
@RequestMapping("restaurant")
public class RestaurantsController {

	@Autowired
	RestaurantsService service;
	
	@GetMapping("all")
	public ResponseEntity<List<Restaurants>> getAll(){
		
		return new ResponseEntity(service.getRestaurants(),HttpStatus.OK);
	}
	
	@PostMapping("add")
	public Restaurants addRestaurant(@RequestBody Restaurants r){
		
		return service.addRestaurant(r);
	}
	
	@GetMapping("search/rid/{rid}")
	public Optional<Restaurants> findRestaurants(@PathVariable(name="rid")int r){
		
		return service.findById(r);
	}
	
}
