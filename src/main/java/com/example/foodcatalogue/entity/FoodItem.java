package com.example.foodcatalogue.entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class FoodItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String itemName;
	
	private String itemDescription;
	
	private boolean isVeg;
	
	private Number price;
	
	private Integer restaurantId;
	
	@Column(nullable = false , columnDefinition = "INT DEFAULT 0")
	private Integer quantity;
	
	

}
