package com.tumbaga_project.Coffee_Vhen.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumbaga_project.Coffee_Vhen.Model.UserModel;

@RestController
public class UserController {

    //http:localhost:8080/user
    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1, "jeven 11","jeven.11@gmail.com", "jeven11");
    }
    
}
