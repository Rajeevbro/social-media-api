package com.socialmedia.socialmediaapi.userFeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPostRepository extends JpaRepository<Long,UserPostRepository> {
}
