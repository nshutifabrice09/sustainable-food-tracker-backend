package com.example.demo.service;

import com.example.demo.model.Farm;
import com.example.demo.model.User;
import com.example.demo.repository.FarmRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmServiceImplementation implements FarmService{

    private final FarmRepository farmRepository;
    private final UserRepository userRepository;

    @Autowired
    public FarmServiceImplementation(FarmRepository farmRepository, UserRepository userRepository) {
        this.farmRepository = farmRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Farm> getAllFarms() {
        return farmRepository.findAll();
    }

    @Override
    public Farm getFarmById(Long id) {
        return farmRepository.findFarmById(id);
    }

    @Override
    public Farm saveFarm(Farm farm, Long userId) {
        User user = userRepository.findUserById(userId);
        return null;
    }

    @Override
    public Farm updateFarm(Long id, Farm farm) {
        return null;
    }

    @Override
    public void removeFarm(Long id) {

    }
}
