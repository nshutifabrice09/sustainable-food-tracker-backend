package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable ("id") Long id) {
        return userService.getUserById(id);
    }

<<<<<<< HEAD
    @PutMapping("/update/user/{id}")
    public User updateUser(@PathVariable ("id") Long id, @RequestBody User user){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("/delete/user/{id}")
    public void removeById(@PathVariable ("id") Long id) {
        userService.removeUser(id);
    }
=======

>>>>>>> 75456f2e2c1f48dfe35f065a142f1bd0d2252584
}
