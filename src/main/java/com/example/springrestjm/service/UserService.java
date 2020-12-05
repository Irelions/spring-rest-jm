package com.example.springrestjm.service;

import com.example.springrestjm.model.Role;
import com.example.springrestjm.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface UserService {
    User getUserByName(String name);
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);

    void deleteUserById(int id);
    List<User> findUserByUsername(String username);

    List<Role> allRoles();
    Set<Role> allRolesString();
}
