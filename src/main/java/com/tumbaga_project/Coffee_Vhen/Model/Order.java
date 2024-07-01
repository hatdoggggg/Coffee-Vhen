package com.tumbaga_project.Coffee_Vhen.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertbl")
public class Order {

    private @Id
    @GeneratedValue Long orderId;
    private Long userId;
    private double totalAmount;
    private String status;

    Order (){}

    public Order(Long userId, double totalAmount,String status){
        this.userId= userId;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    //getters
    public Long getorderId(){
        return orderId;
    }
    public Long getuserId(){
        return userId;
    }

    public double gettotalAmount(){
        return totalAmount;
    }
    public String getstatus(){
        return status;
    }

    //Setters
    public void setuserId(Long userId){
        this.userId = userId;
    }

    public void settotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public void setstatus(String status){
        this.status = status;
    }
}
