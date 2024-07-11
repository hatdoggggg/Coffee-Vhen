package com.tumbaga_project.Coffee_Vhen.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    private @Id
    @GeneratedValue Long id;
    private String productName;
    private String description;
    private double price;
    private String url;

    Product(){}


    public Product(String productName, String description, double price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    //setters/
    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //getters//
    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }


    public String getProductName() {
        return productName;
    }


    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }
    
}
