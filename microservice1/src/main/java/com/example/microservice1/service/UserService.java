package com.example.microservice1.service;

import com.example.microservice1.entity.User;
import com.example.microservice1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired // 自动注入UserRepository，方便与数据库交互
    private UserRepository userRepository;

    public User registerUser(User user) {
        // 检查用户名或邮箱是否已存在
        Optional<User> existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser.isPresent()) {
            throw new RuntimeException("Username is already taken");
        }
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email is already registered");
        }

        return userRepository.save(user); // 保存用户信息
    }

    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}


