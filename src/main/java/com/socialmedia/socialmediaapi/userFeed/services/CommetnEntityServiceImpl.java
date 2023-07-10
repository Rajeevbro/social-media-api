package com.socialmedia.socialmediaapi.userFeed.services;

import com.socialmedia.socialmediaapi.userFeed.repository.CommentEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommetnEntityServiceImpl implements CommentEntityService{

    @Autowired
    private CommentEntityRepository commentEntityRepository;
}
