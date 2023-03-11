package com.example.ShoppingMall.IService;

import com.example.ShoppingMall.Model.User;
import com.example.ShoppingMall.Repository.UserRepo;
import com.example.ShoppingMall.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IRegisterService implements RegisterService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public User registerUser(User user) {
        return userRepo.save(user);
    }

}
