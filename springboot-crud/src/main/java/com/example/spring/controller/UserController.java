package com.example.spring.controller;

import com.example.spring.entity.User;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/findByName")
    public User findByName(@RequestParam String name){
        return userService.findByName(name);
    }


}
