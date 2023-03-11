package com.example.ShoppingMall.IService;

import com.example.ShoppingMall.Model.User;
import com.example.ShoppingMall.Repository.UserRepo;
import com.example.ShoppingMall.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class IAuthService implements AuthService {
    @Autowired
     UserRepo userRepo;

    @Override
    public Boolean LoginUser(String email, String Password) {
        User u = userRepo.findByEmail(email);
        return Objects.equals(u.getPassword(),Password);
    }
}
