package com.example.ShoppingMall.Service;

import com.example.ShoppingMall.Model.User;

import java.util.List;

public interface ViewUserService
{
    void deleteUser(int id);
    User updateViewUser(User user,int id);
    List<User> getAllViewUsers();
    User getViewUser(int id);
}
