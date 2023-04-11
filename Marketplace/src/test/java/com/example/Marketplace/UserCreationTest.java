package com.example.Marketplace;

import com.example.Marketplace.controllers.UserController;

import com.example.Marketplace.entities.User;
import com.example.Marketplace.enums.Role;
import com.example.Marketplace.repositories.UserRepository;
import com.example.Marketplace.services.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

public class UserCreationTest {
    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }
@Test
    public void testCreateUser() {
    User user = new User();
    user.setEmail("test@gmail.com");
    user.setFirstName("Test");
    user.setLastName("Name");
    user.setPassword("123456789");
    user.setRole(Role.USER);

    //User savedUser = UserRepository.saved(user);
}
}
