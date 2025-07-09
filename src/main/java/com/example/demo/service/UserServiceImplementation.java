package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existUser = userRepository.findUserById(id);
        if(existUser != null){
            existUser.setUsername(user.getUsername());
            existUser.setEmail(user.getEmail());
            existUser.setPassword(user.getPassword());
            return userRepository.save(existUser);
        }
        return null;
    }
    @Override
    public void removeUser(Long id) {
        userRepository.deleteById(id);
    }
}
