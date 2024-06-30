package com.test.postman.postman.service;

import com.test.postman.postman.model.Login;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


    public Login checkLoginDetails() {

        return new Login("1", "gg", "test", "gg@gamil.com", "9886772992", "rr nagar", "bangalore", "karnataka", "india", "560098");
    }
}
