package ru.hasan.springmvc.dao;

import ru.hasan.springmvc.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User showUser(int id);

    void updateUser(int id, User user);
}
