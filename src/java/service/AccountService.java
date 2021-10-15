/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import models.User;

/**
 *
 * @author 775262
 */
public class AccountService {
    
    public User login(String username, String password){
        List<User> users = new ArrayList<>();
        users.add(new User("abe", "password"));
        users.add(new User("barb", "password"));

        for(User user : users){
            if(user.getUserName().equals(username) && user.getPassword().equals(password)){
                return new User(user.getUserName(), null);
            }
        }
        return null;
    }
    
}
