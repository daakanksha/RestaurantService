package com.test.restaurantservice.service;

import java.util.List;
import java.util.Optional;

import com.test.restaurantservice.model.Restaurants;

public interface RestaurantsService {

	public List<Restaurants> getRestaurants();
	public Restaurants addRestaurant(Restaurants r);
	public Optional<Restaurants> findById(int id);
}
