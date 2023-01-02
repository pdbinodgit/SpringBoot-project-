package com.SnigdhTechCrud.SnigdhTechCrud.registration.repository;

import com.SnigdhTechCrud.SnigdhTechCrud.registration.model.Registrations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<Registrations,Integer> {
    public Registrations findByEmailAndPassword(String email,String password);
}
