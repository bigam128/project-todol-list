package com.cision.todolist.service;

import com.cision.todolist.dao.UserRepository;
import com.cision.todolist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository   userRepository;

    public List<User>  findAll(){
       return  userRepository.findAll();
    }
    public User  saveuser(User  user) {
        return userRepository.save(user);
    }


}
