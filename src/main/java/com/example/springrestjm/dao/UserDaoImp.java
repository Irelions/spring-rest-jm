package com.example.springrestjm.dao;

import com.example.springrestjm.model.Role;
import com.example.springrestjm.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Repository
public class UserDaoImp implements UserDao {


//   @PersistenceContext
   @Autowired
   private EntityManager entityManager;

   //Success +
   @Override
   @SuppressWarnings("unchecked")
   public List<User> getAllUsers() {
      Session session = entityManager.unwrap(Session.class);
      return session.createQuery("FROM User").getResultList();
   }


   //Success +
   @Override
   public void addUser(User user) {
         entityManager.persist(user);
   }

   @Override
   public void updateUser(User user){
      entityManager.merge(user);
   }

   //Success +
   @Override
   public void deleteUserById(int id) {
      entityManager.remove(entityManager.find(User.class, (long)id));
   }

   //Success +
   @Override
   public User getUserById(int id) {
      return entityManager.find(User.class, (long)id);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> findUserByUsername(String username) {
      Query query = entityManager.createQuery("FROM User WHERE username = :username");
      query.setParameter("username", username);
      return query.getResultList();
   }

   @Override
   public User getUserByName(String username) {
      return findUserByUsername(username).get(0);
   }

   @Override
   public List<Role> allRoles() {
      List<Role> roles = entityManager.createQuery("FROM Role", Role.class).getResultList();
      return roles;
   }

   @Override
   public Set<Role> allRolesString() {
      List<Role> roles = entityManager.createQuery("FROM Role", Role.class).getResultList();
      Set<Role> temp = new HashSet<>();
      for(Role role : roles){
         temp.add(role);
      }
      String[] a = {"ADMIN", "USER"};
      return temp;
   }
}
