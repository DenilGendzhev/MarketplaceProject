package com.example.Marketplace.repositories;

import com.example.Marketplace.entities.OrgManager;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<OrgManager, Long> {
}
