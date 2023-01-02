package com.SnigdhTechCrud.SnigdhTechCrud.data.service;

import com.SnigdhTechCrud.SnigdhTechCrud.data.model.UserData;
import com.SnigdhTechCrud.SnigdhTechCrud.data.repository.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private DataRepo repo;


    @Override
    public void saveData(UserData userData) {
    repo.save(userData);
    }

    @Override
    public List<UserData> getAll() {
        return repo.findAll();
    }

    @Override
    public UserData getById(int id) {

            return repo.findById(id).get();

    }


}
