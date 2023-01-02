package com.SnigdhTechCrud.SnigdhTechCrud.login.service;

import com.SnigdhTechCrud.SnigdhTechCrud.login.model.User;
import com.SnigdhTechCrud.SnigdhTechCrud.login.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private LoginRepo repo;

    public void saveValue(User user){
    repo.save(user);
    }
}
