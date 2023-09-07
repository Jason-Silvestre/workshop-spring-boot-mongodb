package com.jasonsilvestre.workshopmongo.repository;

import com.jasonsilvestre.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String > {

}
