package com.bank.demo.service;

import com.bank.demo.model.User;
import com.bank.demo.repository.UserRepository;

public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }
    @Override
    public int createUserData(User user) {
        User createdUser = (User) repository.save(user);
        return createdUser.getId();
    }
}
