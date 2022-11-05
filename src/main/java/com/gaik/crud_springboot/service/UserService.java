package com.gaik.crud_springboot.service;


import com.gaik.crud_springboot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void updateUserById(long id, String firstName, String lastName, String email);
}
