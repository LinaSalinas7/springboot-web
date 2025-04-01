package com.lina.springboot.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lina.springboot.springboot_web.controllers.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Lina", "Salinas");
       
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);
        return "details";
    }

}
