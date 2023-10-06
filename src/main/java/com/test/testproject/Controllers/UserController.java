package com.test.testproject.Controllers;

import com.test.testproject.Entity.User;
import com.test.testproject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    public UserService userService;

    @CrossOrigin
    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
