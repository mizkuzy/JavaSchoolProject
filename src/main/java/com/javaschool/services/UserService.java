package com.javaschool.services;

import com.javaschool.model.User;
import com.javaschool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User findUserByNameAndLastname(String name, String lastName) {
        return userRepository.findUserByNameAndLastname(name, lastName);
    }


}
