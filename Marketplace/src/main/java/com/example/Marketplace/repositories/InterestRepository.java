package com.example.Marketplace.repositories;

import com.example.Marketplace.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface InterestRepository extends CrudRepository<User, Long> {
}
