package com.example.Marketplace.services;

import com.example.Marketplace.repositories.FilterRepository;
import com.example.Marketplace.repositories.FilterValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService  {

    @Autowired
    FilterRepository filterRepository;

    @Autowired
    FilterValueRepository filterValueRepository;
}
