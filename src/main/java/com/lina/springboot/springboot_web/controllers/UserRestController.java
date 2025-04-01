package com.lina.springboot.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lina.springboot.springboot_web.controllers.models.User;

//Información con ApiRest

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path="/details")
    public  Map <String, Object> details(){

        Map <String, Object> body = new HashMap<>();
        User user = new User("Lina", "Salinas");
        body.put("title", "Hola mundo");
        body.put("user", user );
        return body;
    }

}
