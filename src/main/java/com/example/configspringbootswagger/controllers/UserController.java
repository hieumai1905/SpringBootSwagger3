package com.example.configspringbootswagger.controllers;

import com.example.configspringbootswagger.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> index() {
        List<User> users = User.getUsers();
        return ResponseEntity.ok(users);
    }
}
