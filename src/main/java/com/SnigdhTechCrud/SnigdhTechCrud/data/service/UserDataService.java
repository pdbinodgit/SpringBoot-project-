package com.SnigdhTechCrud.SnigdhTechCrud.data.service;

import com.SnigdhTechCrud.SnigdhTechCrud.data.model.UserData;

import java.util.List;

public interface UserDataService {
    public void saveData(UserData userData);

    public List<UserData> getAll();

//    public void update(int id);
public UserData getById(int id);

}
