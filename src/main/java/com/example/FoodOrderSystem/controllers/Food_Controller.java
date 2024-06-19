package com.example.FoodOrderSystem.controllers;


import com.example.FoodOrderSystem.entities.Food;
import com.example.FoodOrderSystem.interfaces.Food_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Food_Controller {

    @Autowired
        Food_repo food_repo;


    @PostMapping("/bulk")
    public ResponseEntity<List<Food>> addFoodList(@RequestBody List<Food>foodlist)
    {
        List<Food>foodList=food_repo.saveAll(foodlist);
        return ResponseEntity.status(HttpStatus.CREATED).body(foodList);
    }


    @PostMapping("/insertfood")
    public ResponseEntity<Food> addIndividual(@RequestBody Food food)
    {
        food_repo.save(food);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/")
    public ResponseEntity<List<Food>> listAll()
    {
        List<Food>foodList=food_repo.findAll();

        if(foodList.isEmpty())
        {
            return ResponseEntity.noContent().build();
        }
        else
        {
            return ResponseEntity.ok(foodList);
        }
    }
}
