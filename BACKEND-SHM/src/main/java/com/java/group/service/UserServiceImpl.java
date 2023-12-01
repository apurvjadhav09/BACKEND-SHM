
package com.java.group.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.java.group.entity.User;
import com.java.group.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
    	this.userRepository = userRepository;
    }
    @Override
    public void registerUser(User user) {
        
        user.setRoles("ROLE_USER"); 
        String encryptedPwd = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedPwd);
        user.setUuid(UUID.randomUUID().toString());

        userRepository.save(user);
    }
}
