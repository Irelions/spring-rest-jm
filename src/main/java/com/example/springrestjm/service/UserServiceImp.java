package com.example.springrestjm.service;

import com.example.springrestjm.dao.UserDao;
import com.example.springrestjm.model.Role;
import com.example.springrestjm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    //Success +
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }



    //Success +
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    //Success +
    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    //Success +
    @Override
    public List<User> findUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }

    //Success +
    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }


    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }
//
    @Override
    public List<Role> allRoles() {
        return userDao.allRoles();
    }

    @Override
    public Set<Role> allRolesString() {
        return userDao.allRolesString();
    }
}