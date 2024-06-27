package com.tumbaga_project.Coffee_Vhen.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private int year;
    private String contact;
    private String email;
    private String password;

    User (){}

    public User(int id, String name,String year,String contact, String email, String password){
        this.name = name;
        this.contact = year;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }

    //getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }
    public String getContact(){
        return contact;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
