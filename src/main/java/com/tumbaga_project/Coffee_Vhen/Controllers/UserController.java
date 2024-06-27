package com.tumbaga_project.Coffee_Vhen.Controllers;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tumbaga_project.Coffee_Vhen.Model.User;
import com.tumbaga_project.Coffee_Vhen.NotFoundException.UserNotFoundException;
import com.tumbaga_project.Coffee_Vhen.Repository.UserRepository;

@RestController
public class UserController{

    UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    //http://127.0.0.1:8080/users
    //Get all Users
    @GetMapping("/user")
    public List<User> getUser(){
        return repo.findAll();
    }

    //http://127.0.0.1:8080/user/2
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(() -> new UserNotFoundException(id));
    } 

    //POST ENDPOINT

    //http://127.0.0.1:8080/user/new
    @PostMapping("/user/new")
    public String addUser(@RequestBody User newUser){
        repo.save(newUser);
        return "A new user is added. Yey!";
    }

    //UPDATE ENDPOINTS
    //http://127.0.0.1:8080/user/edit/1 
    @PutMapping("/user/edit/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User newUsers){
        return repo.findById(id)
        .map(user ->{
            user.setName(newUsers.getName());
            user.setYear(newUsers.getYear());
            user.setContact(newUsers.getContact());
            user.setEmail(newUsers.getEmail());
            user.setPassword(newUsers.getPassword());
            return repo.save(user);
        }).orElseGet(()->{
            return repo.save(newUsers);
        });
    }

    //DELETE ENDPOINTS
    //http://127.0.0.1:8080/user/delete/1
    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        repo.deleteById(id);
        return "A User is deleted";
    }
    }
