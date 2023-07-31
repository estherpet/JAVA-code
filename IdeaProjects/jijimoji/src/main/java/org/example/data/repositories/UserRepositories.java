package org.example.data.repositories;

import org.example.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositories extends MongoRepository<User,String> {
}