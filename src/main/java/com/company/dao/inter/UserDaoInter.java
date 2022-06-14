
package com.company.dao.inter;

import com.company.entity.User;

import java.util.List;


public interface UserDaoInter {

     List<User> getAll(String name, String surname, Integer nationalityId);

     User findByEmailAndPassword(String email, String password);

     User getById(int id);

    boolean addUser(User u);
    
     boolean updateUser(User u);

    boolean removeUser(int id);

    User findByEmail(String email);



}
