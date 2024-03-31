package com.example.foodcatalogue.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.foodcatalogue.dto.FoodItemDTO;
import com.example.foodcatalogue.entity.FoodItem;
import com.example.foodcatalogue.mapper.FoodItemMapper;
import com.example.foodcatalogue.repo.FoodItemRepo;

public class FoodCatalogueService {
	
	@Autowired
	FoodItemRepo foodItemRepo;

	public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO) {
		FoodItem foodItemSavedInDB = foodItemRepo.save(FoodItemMapper.INSTANCE.mapFoodItemDTOToFoodItem(foodItemDTO));
		return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDTO(foodItemSavedInDB);
	}

}
