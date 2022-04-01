package com.test.restaurantservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.restaurantservice.model.Restaurants;


@Repository
@Transactional
public interface RestaurantsDao extends JpaRepository<Restaurants,Integer>{

}
