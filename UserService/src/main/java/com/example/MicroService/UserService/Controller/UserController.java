package com.example.MicroService.UserService.Controller;

import com.example.MicroService.UserService.Model.DepartmentUser;
import com.example.MicroService.UserService.Model.User;
import com.example.MicroService.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public DepartmentUser getUser(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
