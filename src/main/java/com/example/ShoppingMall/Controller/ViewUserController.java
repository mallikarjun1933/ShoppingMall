package com.example.ShoppingMall.Controller;

import com.example.ShoppingMall.Model.User;
import com.example.ShoppingMall.Service.ViewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ViewUserController {
    @Autowired
    private ViewUserService viewUserService;
    @PutMapping("users/{id}")
    public ResponseEntity<User> updateViewUser(@RequestBody User user, @PathVariable("id") int id)
    {
        return ResponseEntity.ok(viewUserService.updateViewUser(user,id));
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteViewUser(@PathVariable("id") int id)
    {
        viewUserService.deleteUser(id);
        return new ResponseEntity("", HttpStatus.NO_CONTENT);
    }
    @GetMapping("/users")
    public List<User> getViewUsers(){
        return viewUserService.getAllViewUsers();
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getViewUser(@PathVariable("id") int id)
    {
        return ResponseEntity.ok().body(viewUserService.getViewUser(id));
    }
}
