package com.codeForStudents.fullstackbackend.controller;

import com.codeForStudents.fullstackbackend.Service.UserService;
import com.codeForStudents.fullstackbackend.entity.User;
import java.util.List;
import java.util.Optional;

import com.codeForStudents.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("users")
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userservice;
    private UserRepository userrepository;


    @GetMapping
    public List<User> listUser(){
        return userservice.listUser();
    }
    /*
    @GetMapping("/user/{id}")
    Optional<User> getUserById (@PathVariable Integer id){
        return  userrepository.findById(id);

    }
    */

    @GetMapping("/findUser/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userservice.getUserById(id);
    }


    @PostMapping("/newUser")
    public User createNewUser( @RequestBody User obj){
        return userservice.createNewUser(obj);
    }


    @PutMapping
    public User updateUser(@RequestBody User obj){
        return userservice.updateUser(obj);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestBody User obj) {
        userservice.deleteUser(obj);
    }



}
