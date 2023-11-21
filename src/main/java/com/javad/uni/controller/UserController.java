package com.javad.uni.controller;

import com.javad.uni.model.User;
import com.javad.uni.repository.UserRepository;
import com.javad.uni.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")

public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    private UserRepository userRepository;

    @GetMapping
    public List<User> users() {
        return userRepository.finaAll();
    }


}
