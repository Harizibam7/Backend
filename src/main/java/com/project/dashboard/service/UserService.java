package com.project.dashboard.service;

import com.project.dashboard.model.User;
import com.project.dashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return  userRepository.save(user);
    }

    public Optional<User> getUserById(Integer id){
        return userRepository.findById(id);
    }

    public User getUserByUsername(String username){
            return userRepository.findByUsername(username);
    }

    public List<User> getUsersByStatus(Boolean status){
        return userRepository.findByStatus(status);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }


}
