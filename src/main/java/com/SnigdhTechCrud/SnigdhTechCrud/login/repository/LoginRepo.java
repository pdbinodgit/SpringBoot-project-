package com.SnigdhTechCrud.SnigdhTechCrud.login.repository;

import com.SnigdhTechCrud.SnigdhTechCrud.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<User,Integer> {

}
