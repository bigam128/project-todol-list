package com.cision.todolist.controller;

import com.cision.todolist.model.User;
import com.cision.todolist.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
     UserService  userService;

    @GetMapping(value = "/liste")
    public List<User> getAllUsers() {
        return  userService.findAll();
    }
    @PostMapping(value = "/save")
    public User  saveuser(User  user)
    {
        return userService.saveuser(user);
    }
}
