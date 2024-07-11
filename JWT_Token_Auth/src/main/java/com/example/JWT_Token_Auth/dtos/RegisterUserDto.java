package com.example.JWT_Token_Auth.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserDto {


    private String email;

    private String password;

    private String fullName;

}