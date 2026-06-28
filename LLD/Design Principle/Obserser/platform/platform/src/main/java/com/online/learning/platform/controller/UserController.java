package com.online.learning.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.learning.platform.dto.UserDto;
import com.online.learning.platform.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/user")
public class UserController {


    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/add")
    public String postMethodName(@RequestBody UserDto userDto) {
        //TODO: process POST request
        userService.addUser(userDto);
        return "User added successfully";
    }
    
}
