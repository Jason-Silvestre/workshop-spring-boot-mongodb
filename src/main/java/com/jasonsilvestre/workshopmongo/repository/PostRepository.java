package com.jasonsilvestre.workshopmongo.repository;


import com.jasonsilvestre.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String > {

}
