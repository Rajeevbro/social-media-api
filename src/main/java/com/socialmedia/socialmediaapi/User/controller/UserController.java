package com.socialmedia.socialmediaapi.User.controller;

import com.socialmedia.socialmediaapi.User.entity.User;
import com.socialmedia.socialmediaapi.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);

    }

    @GetMapping
    public List<User> getUsers()
    {
        return userService.getUser();
    }
}
