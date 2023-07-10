package com.socialmedia.socialmediaapi.userFeed.repository;

import com.socialmedia.socialmediaapi.userFeed.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentEntityRepository extends JpaRepository<Long, CommentEntity> {
}
