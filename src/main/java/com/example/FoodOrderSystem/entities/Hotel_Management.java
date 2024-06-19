package com.example.FoodOrderSystem.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel_Management {


    @Column(name="employee_name")
    private String employee_name;

    @Id
    @Column(name="employee_id")
    private int employee_id;


    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "Hotel_Management{" +
                "employee_name='" + employee_name + '\'' +
                ", employee_id=" + employee_id +
                '}';
    }
}
