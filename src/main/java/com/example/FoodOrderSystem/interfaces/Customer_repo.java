package com.example.FoodOrderSystem.interfaces;

import com.example.FoodOrderSystem.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_repo extends JpaRepository<Customers,Integer> {
}
