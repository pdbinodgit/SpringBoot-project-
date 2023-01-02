package com.SnigdhTechCrud.SnigdhTechCrud.registration.service;

import com.SnigdhTechCrud.SnigdhTechCrud.registration.model.Registrations;
import com.SnigdhTechCrud.SnigdhTechCrud.registration.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;


public interface RegistrationService {

    public void saveValue(Registrations registrations);

}
