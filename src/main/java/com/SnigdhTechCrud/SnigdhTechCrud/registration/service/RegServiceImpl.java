package com.SnigdhTechCrud.SnigdhTechCrud.registration.service;

import com.SnigdhTechCrud.SnigdhTechCrud.registration.model.Registrations;
import com.SnigdhTechCrud.SnigdhTechCrud.registration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegServiceImpl implements RegistrationService {
    @Autowired
    private RegistrationRepo repo;

    @Override
    public void saveValue(Registrations registrations) {
        System.out.println(registrations);
      repo.save(registrations) ;



    }
}
