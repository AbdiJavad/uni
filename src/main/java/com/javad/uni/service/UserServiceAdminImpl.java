package com.javad.uni.service;

import com.javad.uni.model.User;
import com.javad.uni.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceAdminImpl implements UserService {

    @Autowired

    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return null;
    }
    
    @Override
    public User update(Long id, User user) {
        Optional<User> userData = userRepository.findById(id);
        if (userData.isPresent()) {
            if (user.getUsername() != null) {
                userData.get().setUsername(user.getUsername());

            } else if (user.getPassword() != null) {
                userData.get().setPassword(user.getPassword());
            }
            return userRepository.save(userData.get());
        }
        return null;
    }

    @Override
    public void delete(Long is) {

    }

    @Override
    public List<User> users() {

        return null;
    }

}
