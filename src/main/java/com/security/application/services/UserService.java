package com.security.application.services;





import com.security.application.model.User;
import com.security.application.repositories.UserRepository;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByEmail(String email) {
        User user = userRepository.findUserByEmail(email)
/*
                .orElseThrow(() -> new IllegalArgumentException("User not found with email: " + email));
*/;
        return user;
    }

    public User createUser(User user) {
        validateUser(user);
        User newUser = userRepository.save(user);
        userRepository.flush();
        return newUser;
    }


    private void validateUser(User user) {
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
    }

}