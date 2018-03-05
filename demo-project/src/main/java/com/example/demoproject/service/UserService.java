package com.example.demoproject.service;

import com.example.demoproject.domain.User;
import com.example.demoproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void SaveUser(User user){
        userRepository.save(user);
    }

}
