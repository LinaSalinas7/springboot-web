package com.lina.springboot.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lina.springboot.springboot_web.controllers.models.User;
import com.lina.springboot.springboot_web.controllers.models.dto.UserDTO;

//Información con ApiRest

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path="/details")
    public  UserDTO details(){

        UserDTO userdto = new UserDTO();

        User user = new User("Lina", "Salinas");
        userdto.setUser(user);
        userdto.setTitle("Hola mundo");
        
    
        return userdto;
    }

    @GetMapping(path="/details-map")
    public  Map <String, Object> detailsMap(){

        Map <String, Object> body = new HashMap<>();
        User user = new User("Lina", "Salinas");
        body.put("title", "Hola mundo");
        body.put("user", user );
        return body;
    }

}
