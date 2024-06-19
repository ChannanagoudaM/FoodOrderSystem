package com.example.FoodOrderSystem.controllers;

import com.example.FoodOrderSystem.entities.Customers;
import com.example.FoodOrderSystem.entities.Hotel_Management;
import com.example.FoodOrderSystem.interfaces.Customer_repo;
import com.example.FoodOrderSystem.interfaces.Hotel_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Home_controller {


    @Autowired
    Customer_repo c_repo;


    @Autowired
    Hotel_repo h_repo;

    @PostMapping("/insert")
    public Customers insert_customer( @RequestBody Customers customer)
    {
        Customers customers1=c_repo.save(customer);
        return customers1;
    }



    @GetMapping("/get/{customer_id}")
    public ResponseEntity<Customers> get_customerbyId(@PathVariable int customer_id)
    {
        Optional<Customers> customers=c_repo.findById(customer_id);
        return customers.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/")
    public ResponseEntity<List<Customers>> getAll()
    {
            List<Customers>listofCustomers=c_repo.findAll();
            if(listofCustomers.isEmpty())
            {
               return ResponseEntity.noContent().build();
            }
            else
            {
                return ResponseEntity.ok(listofCustomers);
            }
    }


    @DeleteMapping("/delete/{customer_id}")
    public ResponseEntity<Customers> delete_customers(@PathVariable int customer_id)
    {
        Optional<Customers>optionalCustomers=c_repo.findById(customer_id);

        if(optionalCustomers.isPresent())
        {
            c_repo.deleteById(customer_id);
           return ResponseEntity.noContent().build();
        }
        else
        {
           return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/")
    public  ResponseEntity<List<Customers>> deleteAllCustomers()
    {
        c_repo.deleteAll();
        return  ResponseEntity.noContent().build();
    }





}

