package com.imam.controllers;

import com.imam.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    List<User> allUsers=new ArrayList<>();

    @GetMapping("/users")
    public List<User> getAllUsers(){
        User user1=new User("Md","Imam","imam@gmail.com","8409990");
        allUsers.add(user1);
        User user2=new User("Md","Asif","asif@gmail.com","9834634");
        allUsers.add(user2);
        return allUsers;
    }
}
