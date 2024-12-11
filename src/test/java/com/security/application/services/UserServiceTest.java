package com.security.application.services;

import com.security.application.model.User;
import com.security.application.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest

class UserServiceTest {

    @Autowired
    private UserService userService;


    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        User user = new User("test@example.com", "password", "John",
                "Doe","02-02-1932");
when(userRepository.save(user)).thenReturn(user);

        User createdUser = userService.createUser(user);

        assertNotNull(createdUser);
        assertEquals("test@example.com", createdUser.getEmail());
    }



}