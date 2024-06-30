package com.test.postman.postman.controller;


import com.test.postman.postman.api.LoginApi;
import com.test.postman.postman.model.Login;
import com.test.postman.postman.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController implements LoginApi {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public Login login() {

        return loginService.checkLoginDetails();
    }
}
