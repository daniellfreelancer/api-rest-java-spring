package com.codeForStudents.fullstackbackend.Service;


import com.codeForStudents.fullstackbackend.entity.User;
import com.codeForStudents.fullstackbackend.repository.UserRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;


@Service
public class UserService {

    @Autowired
    private UserRepository userrepository;

    public User createNewUser(User obj){
        return userrepository.save(obj);
    }

    public List<User> listUser(){
        return userrepository.findAll();
    }
    public Optional<User> getUserById(Integer id){
        return userrepository.findById(id);

    }

    public void deleteUser(User obj){
        userrepository.delete(obj);
    }

    public User updateUser(User obj){
        return userrepository.save(obj);
    }





}
