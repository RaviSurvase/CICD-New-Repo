package com.example.SpringSecurity.servises;

import com.example.SpringSecurity.module.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list=new ArrayList<User>() ;
    public  UserService(){
        list.add(new User("ABC","abc","abc@gmail.com"));
        list.add(new User("XYZ","xyz","xyz@gmail.com"));
    }
    //getAll Users

    public List<User> getAllUser(){
        return this.list;
    }
    public User getUser(String username){
        return  this.list.stream().filter((user) ->user.getUsername().equals(username)).findAny().orElse(null);
    }
    public User addUser(User user){
      this.list.add(user);
      return user;
    }
}
