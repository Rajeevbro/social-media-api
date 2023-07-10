package com.socialmedia.socialmediaapi.userFeed.services;

import com.socialmedia.socialmediaapi.userFeed.repository.PostDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostDetailServiceImpl implements PostDetailService{

    @Autowired
    private PostDetailsRepository postDetailsRepository;
}
