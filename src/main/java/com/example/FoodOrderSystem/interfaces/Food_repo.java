package com.example.FoodOrderSystem.interfaces;

import com.example.FoodOrderSystem.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Food_repo extends JpaRepository<Food,Integer> {

//    Food findbyfood_name(String food_name);
}
