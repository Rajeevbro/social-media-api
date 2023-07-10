package com.socialmedia.socialmediaapi.userFeed.repository;

import com.socialmedia.socialmediaapi.userFeed.entity.PostDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDetailsRepository extends JpaRepository<Long, PostDetails> {
}
