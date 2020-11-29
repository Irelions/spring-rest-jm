package com.example.springrestjm.dao;



import com.example.springrestjm.model.Role;
import com.example.springrestjm.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao {
   List<User> listAllUsers();
   void add(User user);
   void delete(int id);
   User showUser (int id);
   List<User> findUserByUsername(String username);
   User getUserByName(String name);
   List<Role> allRoles();
   Set<Role> allRolesString();
}
