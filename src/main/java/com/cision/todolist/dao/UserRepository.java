package com.cision.todolist.dao;

import com.cision.todolist.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {


    List<User> findAll();

    public User findByUsername(String  username);


}
