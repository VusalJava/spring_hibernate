package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {

   //add user
   void add(User user);

   //read table
   List<User> listUsers();

   //get user by car
   User findUserByCar(String model,int series);

   // clean table
   void cleanUserTable();
}
