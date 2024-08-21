package com.carj.carj.Controllers;


import com.carj.carj.Models.User;
import com.carj.carj.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    public User getUser(@RequestBody Long id){
        return userService.getUserById(id);
    }

}
