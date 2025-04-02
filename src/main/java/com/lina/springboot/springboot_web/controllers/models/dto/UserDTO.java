    package com.lina.springboot.springboot_web.controllers.models.dto;

import com.lina.springboot.springboot_web.controllers.models.User;

public class UserDTO {

    private String title;
    private User user;

    public UserDTO() {
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    

    
    

}
