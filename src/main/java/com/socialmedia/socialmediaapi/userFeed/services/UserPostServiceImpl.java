package com.socialmedia.socialmediaapi.userFeed.services;

import com.socialmedia.socialmediaapi.userFeed.repository.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPostServiceImpl implements UserPostService{

    @Autowired
    private UserPostRepository userPostRepository;
}
