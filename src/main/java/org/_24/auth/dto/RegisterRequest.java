package org._24.auth.dto;

import jakarta.validation.constraints.*;


public class RegisterRequest {

    @NotBlank(message = "Email cannot be blank!")
    @Email(message = "Email should be valid!")
    private String email;

    @NotBlank(message = "Password cannot be blank!")
    @Size(min = 6, message = "Password cannot be less than 6 characters!")
    private String password;

    @NotBlank(message = "Name cannot be blank!")
    private  String name;

    public RegisterRequest(){}

    public RegisterRequest(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }

    public String getPassword(){ return password; }
    public void setPassword(String password){ this.password = password; }

    public String getName(){ return name; }
    public void setName(String name ){ this.name = name; }
}
