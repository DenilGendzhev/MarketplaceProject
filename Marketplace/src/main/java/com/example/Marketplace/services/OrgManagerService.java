package com.example.Marketplace.services;

import com.example.Marketplace.entities.OrgManager;
import com.example.Marketplace.enums.Role;
import com.example.Marketplace.repositories.AdRepository;
import com.example.Marketplace.repositories.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgManagerService {

    @Autowired
    OrganizationRepository organizationRepository;

    @Autowired
    AdRepository adRepository;
}
