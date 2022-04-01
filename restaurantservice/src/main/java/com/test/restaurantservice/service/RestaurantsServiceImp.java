package com.test.restaurantservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.restaurantservice.dao.RestaurantsDao;
import com.test.restaurantservice.model.Restaurants;

@Service
public class RestaurantsServiceImp implements RestaurantsService{

	@Autowired
	RestaurantsDao dao;
	
	@Override
	public List<Restaurants> getRestaurants() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Restaurants addRestaurant(Restaurants r) {
		// TODO Auto-generated method stub
		return dao.save(r);
	}

	@Override
	public Optional<Restaurants> findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
