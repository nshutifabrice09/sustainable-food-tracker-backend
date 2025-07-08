package com.example.demo.service;

import com.example.demo.model.Farm;

import java.util.List;

public interface FarmService {
    List<Farm> getAllFarms();
    Farm getFarmById(Long id);
    Farm saveFarm (Farm farm, Long userId);
    Farm updateFarm (Long id, Farm farm);
    void removeFarm (Long id);
}
