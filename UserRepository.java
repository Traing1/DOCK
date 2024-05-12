package com.example.springbootmongodemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.springbootmongodemo.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    // Define your repository interface here
}
