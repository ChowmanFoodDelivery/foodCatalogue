package com.example.foodcatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodcatalogue.dto.FoodItemDTO;
import com.example.foodcatalogue.service.FoodCatalogueService;

@RestController
@RequestMapping("/foodCatalogue")
public class FoodCatalogueController {
	
	@Autowired
	FoodCatalogueService foodCatalogueService;
	
	@PostMapping("addFoodItem")
	public ResponseEntity<FoodItemDTO> addFoodItem(@RequestBody FoodItemDTO foodItemDTO){
		FoodItemDTO foodItemSaved = foodCatalogueService.addFoodItem(foodItemDTO);
		return new ResponseEntity<>(foodItemSaved, HttpStatus.CREATED);
	}
	

}
