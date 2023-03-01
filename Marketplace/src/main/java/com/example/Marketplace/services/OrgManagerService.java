package com.example.Marketplace.services;

import com.example.Marketplace.repositories.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgManagerService {

    @Autowired
    AdRepository adRepository;
}
