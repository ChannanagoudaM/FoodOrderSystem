package com.example.FoodOrderSystem.controllers;


import com.example.FoodOrderSystem.entities.Hotel_Management;
import com.example.FoodOrderSystem.interfaces.Hotel_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Hotel_Controller {


    @Autowired
    Hotel_repo hotel_repo;


    @PostMapping("/inserthotel")
    public ResponseEntity<Hotel_Management> insertIndividual(@RequestBody Hotel_Management hotel_management)
    {
        hotel_repo.save(hotel_management);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/bulk")
    public ResponseEntity<List<Hotel_Management>> insertAll(@RequestBody List<Hotel_Management> management)
    {
           List<Hotel_Management>hotel_list= hotel_repo.saveAll(management);

           return  ResponseEntity.status(HttpStatus.CREATED).body(hotel_list);
    }

    @GetMapping("/getemployee/{employee_id}")
    public ResponseEntity<Hotel_Management> findById(@PathVariable int employee_id)
    {
        Optional<Hotel_Management>optionalHotelManagement =hotel_repo.findById(employee_id);
        return optionalHotelManagement.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());

    }

    @GetMapping("/")
    public ResponseEntity<List<Hotel_Management>> findAll()
    {
        List<Hotel_Management> employee_list=hotel_repo.findAll();

        if(employee_list.isEmpty())
        {
          return  ResponseEntity.notFound().build();
        }
        else
        {
         return   ResponseEntity.ok(employee_list);
        }
    }


    @DeleteMapping("delete/{employee_id}")
    public ResponseEntity<Hotel_Management> deleteById(@PathVariable int employee_id)
    {
            Optional<Hotel_Management>optionalHotelManagement=hotel_repo.findById(employee_id);
            if(optionalHotelManagement.isPresent())
            {
                hotel_repo.deleteById(employee_id);
                return  ResponseEntity.noContent().build();
            }
            else
            {
                return ResponseEntity.notFound().build();
            }
    }


    @DeleteMapping("/")
    public ResponseEntity<List<Hotel_Management>> deleteAllEmployees()
    {
        hotel_repo.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
