package com.example.Marketplace.controllers;

import com.example.Marketplace.repositories.EventRepository;
import com.example.Marketplace.repositories.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    OrganizationRepository organizationRepository;
    @Autowired
    EventRepository eventRepository;


}
