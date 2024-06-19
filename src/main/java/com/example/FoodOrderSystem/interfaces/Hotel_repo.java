package com.example.FoodOrderSystem.interfaces;

import com.example.FoodOrderSystem.entities.Hotel_Management;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hotel_repo  extends JpaRepository<Hotel_Management,Integer> {
}
