package com.example.FoodOrderSystem.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customers {


    @Column(name="customer_name")
    private  String customer_name;
    @Id
    @Column(name="customer_id")
    private int customer_id;
    @Column(name="customer_email")
    private String customer_email;
    @Column(name="mob_number")
    private long mob_number;

//    public Customers()
//    {
//
//    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }


    public String getCustomer_email() {
        return customer_email;
    }

    public long getMob_number() {
        return mob_number;
    }

    public void setMob_number(long mob_number) {
        this.mob_number = mob_number;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

//    public Customers(String customer_name,int customer_id,String customer_email,long mob_number) {
//        this.customer_name = customer_name;
//        this.customer_email=customer_email;
//        this.mob_number=mob_number;
//        this.customer_id=customer_id;
//    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_name='" + customer_name + '\'' +
                ", customer_id=" + customer_id +
                ", customer_email='" + customer_email + '\'' +
                ", mob_number=" + mob_number +
                '}';
    }
}
