package com.example.spring.service;

import com.example.spring.entity.User;
import com.example.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByName(String name){
        return userRepository.findByName(name);
    }
    public User save(User user){
        return userRepository.save(user);
    }
}
