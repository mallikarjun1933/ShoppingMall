package com.example.ShoppingMall.Controller;

import com.example.ShoppingMall.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class AuthController {
    @Autowired
    AuthService authService;
    @GetMapping("users/{email}/{password}")
    public ResponseEntity<Object> UserLogin(@PathVariable("email") String email,@PathVariable("password") String password)
    {
        if(authService.LoginUser(email,password))
        {
            return new ResponseEntity<Object>("Login Successful",HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>("Login Unsuccessful",HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
