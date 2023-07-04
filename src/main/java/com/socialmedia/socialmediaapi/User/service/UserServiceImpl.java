package com.socialmedia.socialmediaapi.User.service;

import com.socialmedia.socialmediaapi.User.entity.User;
import com.socialmedia.socialmediaapi.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public String addUser(User user) {
        User userObject = new User();
        userObject.setFirstName(user.getFirstName());
        userObject.setLastName(user.getLastName());
        userObject.setCity(user.getCity());
        userObject.setCountry(user.getCountry());
        userObject.setEmail(user.getEmail());

        userRepository.save(userObject);
        return " Success";
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
