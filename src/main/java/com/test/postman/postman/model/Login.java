package com.test.postman.postman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Login {

    String id;
    String username;
    String password;
    String email;
    String phone;
    String address;
    String city;
    String state;
    String country;
    String zip;

    public static final String LOGIN = "login";

}