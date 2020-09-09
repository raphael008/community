package com.github.raphael008.service;

import com.github.raphael008.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserRepository {
    public void remove();
}
