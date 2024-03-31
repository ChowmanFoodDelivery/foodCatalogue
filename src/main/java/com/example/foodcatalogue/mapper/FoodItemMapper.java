package com.example.foodcatalogue.mapper;

import org.mapstruct.factory.Mappers;

import com.example.foodcatalogue.dto.FoodItemDTO;
import com.example.foodcatalogue.entity.FoodItem;

public interface FoodItemMapper {
	
	FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);
	//
	
	FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO);
	
	FoodItemDTO	mapFoodItemToFoodItemDTO(FoodItem foodItem);
	
}
