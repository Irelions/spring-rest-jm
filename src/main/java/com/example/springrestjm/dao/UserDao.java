package com.example.springrestjm.dao;



import com.example.springrestjm.model.Role;
import com.example.springrestjm.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao {
   List<User> getAllUsers();
   User getUserById (int id);
   void addUser(User user);
   void deleteUserById(int id);
   void updateUser(User user);


   List<User> findUserByUsername(String username);
   User getUserByName(String name);
   List<Role> allRoles();
   Set<Role> allRolesString();
}
