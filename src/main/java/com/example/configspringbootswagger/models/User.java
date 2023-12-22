package com.example.configspringbootswagger.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("user1");
        users.add(user1);
        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("user2");
        users.add(user2);
        return users;
    }
}
