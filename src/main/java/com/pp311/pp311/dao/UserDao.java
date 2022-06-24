package com.pp311.pp311.dao;

import java.util.List;

import com.pp311.pp311.model.User;



public interface UserDao {
    void addUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getAllUsers();
}
