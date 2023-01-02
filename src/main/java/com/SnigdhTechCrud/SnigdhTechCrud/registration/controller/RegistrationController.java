package com.SnigdhTechCrud.SnigdhTechCrud.registration.controller;

import com.SnigdhTechCrud.SnigdhTechCrud.registration.model.Registrations;
import com.SnigdhTechCrud.SnigdhTechCrud.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService service;

   @GetMapping("/")
    public String index(){
       return "index";
   }

   @GetMapping("/signUp")
    public String signUp(){
       return "register";
   }

   @PostMapping("/saveValue")
    public String saveValue(@ModelAttribute Registrations registrations){
       service.saveValue(registrations);
       return "redirect:/";

   }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
