package com.github.raphael008.controller;

import com.github.raphael008.dao.UserDao;
import com.github.raphael008.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user", produces = "application/json")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("findAll")
    public Iterable<UserDao> findAll() {
        return userRepository.findAll();
    }
}
