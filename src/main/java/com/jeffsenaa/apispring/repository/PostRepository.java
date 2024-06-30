package com.jeffsenaa.apispring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jeffsenaa.apispring.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
