package com.example.FoodOrderSystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="food")
public class Food {

    @Id
    @Column(name="food_id")
    private int food_id;
    @Column(name="food_name")
    private String food_name;
    @Column(name="food_type")
    private String food_type;
    @Column(name="food_cost")
    private int food_cost;


    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }

    public int getFood_cost() {
        return food_cost;
    }

    public void setFood_cost(int food_cost) {
        this.food_cost = food_cost;
    }

    @Override
    public String toString() {
        return "Food{" +
                "food_name='" + food_name + '\'' +
                ", food_type='" + food_type + '\'' +
                ", food_cost=" + food_cost +
                '}';
    }
}
