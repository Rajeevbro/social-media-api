package com.socialmedia.socialmediaapi.User.service;

import com.socialmedia.socialmediaapi.User.entity.User;

import java.util.List;

public interface UserService {
    String addUser(User user);

   List<User> getUser();
}
