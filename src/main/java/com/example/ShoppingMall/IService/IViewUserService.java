package com.example.ShoppingMall.IService;

import com.example.ShoppingMall.Model.User;
import com.example.ShoppingMall.Repository.UserRepo;
import com.example.ShoppingMall.Service.ViewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IViewUserService implements ViewUserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void deleteUser(int id) {
     User del=userRepo.findById(id).orElseThrow(()->new RuntimeException());
     userRepo.delete(del);
    }

    @Override
    public User updateViewUser(User user, int id) {
        User dus=userRepo.findById(id).orElseThrow(()->new RuntimeException());
        dus.setName(user.getName());
        dus.setAge(user.getAge());
        dus.setDOB(user.getDOB());
        dus.setAddress(user.getAddress());
        dus.setEmail(user.getEmail());
        dus.setGender(user.getGender());
        dus.setStatus(user.getStatus());
        dus.setPassword(user.getPassword());
        dus.setCreatedDate(user.getCreatedDate());
        dus.setLoginDate(user.getLoginDate());
        dus.setPhoneNumber(user.getPhoneNumber());
        dus.setRoles(user.getRoles());
        return userRepo.save(dus);
    }

    @Override
    public List<User> getAllViewUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getViewUser(int id) {
        return userRepo.findById(id).orElseThrow(()->new RuntimeException());

    }
}
