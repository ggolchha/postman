package com.test.postman.postman.api;

import com.test.postman.postman.model.Login;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api")
public interface LoginApi {

    @GetMapping("/login")
    @Description("Login")
    Login login();
}
