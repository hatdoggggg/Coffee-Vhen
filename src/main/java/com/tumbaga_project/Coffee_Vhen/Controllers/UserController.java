package com.tumbaga_project.Coffee_Vhen.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tumbaga_project.Coffee_Vhen.Model.UserModel;

@RestController
public class UserController {

    //Fetch one data
    //http:localhost:8080/user
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "jeven 11","jeven.11@gmail.com", "jeven11");
    }

    //Fetch multiple data
    //http:localhost:8080/users
    @GetMapping("/users")
    public List <UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(1, "Mario", "mario@gmail.com", "mario"));
        users.add(new UserModel(1, "Vhenus", "vm@gmail.com", "vhenus"));
        users.add(new UserModel(1, "Ruffa", "ruffa@gmail.com", "ruffa"));
        return users;
    }

    //http:localhost:8080/user/juan
    @GetMapping("/user/{name}")
    public UserModel getUserFromName(@PathVariable ("name")String name){
        return new UserModel(1,"Mario","mario@gmail.com","mario");
    }
    
}
