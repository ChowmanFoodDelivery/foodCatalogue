package com.example.foodcatalogue.dto;

import java.util.List;

import com.example.foodcatalogue.entity.FoodItem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodCataloguePage {
	
	private List<FoodItem> foodItemList;
	
	private Restaurant restaurant;
	

}
