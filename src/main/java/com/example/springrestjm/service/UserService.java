package com.example.springrestjm.service;

import com.example.springrestjm.model.Role;
import com.example.springrestjm.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface UserService {
    void add(User user);
    List<User> listUsers();
    User showUser (int id);
    void delete(int id);
    List<User> findUserByUsername(String username);
    User getUserByName(String name);
    List<Role> allRoles();
    Set<Role> allRolesString();
}
