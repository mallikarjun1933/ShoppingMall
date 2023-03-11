package com.example.ShoppingMall.Controller;

import com.example.ShoppingMall.Model.User;
import com.example.ShoppingMall.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1")
public class RegisterController {
    @Autowired
    private RegisterService registerUser;
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid  @RequestBody User user)
    {
        return new ResponseEntity<>(registerUser.registerUser(user), HttpStatus.CREATED);
    }
}
