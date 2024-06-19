package com.example.FoodOrderSystem.controllers;


import com.example.FoodOrderSystem.entities.Food;
import com.example.FoodOrderSystem.interfaces.Customer_repo;
import com.example.FoodOrderSystem.interfaces.Food_repo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Orderclass {

        @Autowired
        Customer_repo customer_repo;

        @Autowired
        Food_repo food_repo;


        @GetMapping("/orderfood")
        public ResponseEntity<Optional<Food>> orderFood(@PathVariable int food_id)
        {
                Optional<Food> food=food_repo.findById(food_id);
                return ResponseEntity.ok(food);
        }


}
