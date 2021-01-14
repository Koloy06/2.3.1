package ru.hasan.springmvc.service;

import ru.hasan.springmvc.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User showUser(int id);

    void updateUser(int id, User user);

}
