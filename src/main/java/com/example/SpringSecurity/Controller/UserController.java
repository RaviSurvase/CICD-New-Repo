package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.module.User;
import com.example.SpringSecurity.servises.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired

     private UserService userService;
    //all users
    @GetMapping("/")
   public List<User> getAllUsers(){
       return this.userService.getAllUser();
   }
   @GetMapping("/{username}")
   public User getUser(@PathVariable("username") String userName){
        return this.userService.getUser(userName);
   }
   @PostMapping("/")
   public User add(@RequestBody User user){
        return this.userService.addUser(user);
   }
}
