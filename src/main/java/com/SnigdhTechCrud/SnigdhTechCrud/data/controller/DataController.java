package com.SnigdhTechCrud.SnigdhTechCrud.data.controller;

import com.SnigdhTechCrud.SnigdhTechCrud.data.model.UserData;
import com.SnigdhTechCrud.SnigdhTechCrud.data.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DataController {
    @Autowired
    private UserDataService service;

    @GetMapping("/saveData")
    public String add(){
    return "save";
    }
    @PostMapping("/add")
    public String save(@ModelAttribute UserData userData){
        service.saveData(userData);
        return "redirect:/home";
    }
    @GetMapping("/showData")
    public ModelAndView show(){
        List<UserData> list=service.getAll();
        return new ModelAndView("show","show",list);

    }

//    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
//    //@RequestMapping(value = "/show/{id}",method = RequestMethod.PUT)
//    public String update(@PathVariable("id") int id,@RequestBody UserData userData){
//        UserData existingData=service.getById(id);
//        existingData.setName(userData.getName());
//        existingData.setPlace(userData.getPlace());
//        service.saveData(existingData);
//        return "redirect:/show";
//    }



}
