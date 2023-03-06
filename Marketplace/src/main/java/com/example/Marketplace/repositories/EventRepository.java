package com.example.Marketplace.repositories;

import com.example.Marketplace.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
