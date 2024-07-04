package com.tumbaga_project.Coffee_Vhen.DTO;

public class LoginRequest {
    private String usernameOrEmail;
    private String password;

    LoginRequest(){}


//constructor
    public LoginRequest(String usernameOrEmail, String password) {
        this.usernameOrEmail = usernameOrEmail;
        this.password = password;
    }

//setters
    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }


    public void setPassword(String password) {
        this.password = password;
    }
//getters

    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }


    public String getPassword() {
        return password;
    }


}
