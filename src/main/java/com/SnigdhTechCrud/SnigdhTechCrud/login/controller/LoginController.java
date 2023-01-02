package com.SnigdhTechCrud.SnigdhTechCrud.login.controller;

import com.SnigdhTechCrud.SnigdhTechCrud.login.model.User;
import com.SnigdhTechCrud.SnigdhTechCrud.registration.model.Registrations;
import com.SnigdhTechCrud.SnigdhTechCrud.registration.repository.RegistrationRepo;
import com.SnigdhTechCrud.SnigdhTechCrud.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
@Autowired
private RegistrationRepo repo;
   @GetMapping("/signIn")
   public String signUp(){
      return "LoginPage";
   }

@GetMapping("/login")
public String login(@ModelAttribute User user) {
//
//   int id = user.getId();
   Registrations registrations = repo.findByEmailAndPassword(user.getEmail(), user.getPassword());
  // Registrations registrations= new Registrations();
   if (user.getEmail().equals(registrations.getEmail()) ||
           user.getPassword().equals(registrations.getPassword())) {
      return "redirect:/home";
   }
   else {
      return "redirect:/login";
   }
}}



