package com.kemisch.paymentgenerator.services;

import com.kemisch.paymentgenerator.domain.User;
import com.kemisch.paymentgenerator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User insert(User user){
        return repository.save(user);
    }
}
