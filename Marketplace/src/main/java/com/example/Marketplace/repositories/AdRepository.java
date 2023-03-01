package com.example.Marketplace.repositories;

import com.example.Marketplace.entities.Ad;
import org.springframework.data.repository.CrudRepository;

public interface AdRepository extends CrudRepository<Ad, Long> {
}
