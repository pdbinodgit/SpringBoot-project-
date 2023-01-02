package com.SnigdhTechCrud.SnigdhTechCrud.data.repository;

import com.SnigdhTechCrud.SnigdhTechCrud.data.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends JpaRepository<UserData,Integer> {
}
