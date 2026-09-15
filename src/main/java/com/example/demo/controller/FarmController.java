package com.example.demo.controller;

import com.example.demo.model.Farm;
import com.example.demo.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class FarmController {

    private final FarmService farmService;

    @Autowired
    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @PostMapping("/farm/{userId}")
    public Farm saveFarm(@RequestBody Farm farm, @PathVariable ("userId") Long userId){
        return farmService.saveFarm(farm, userId);
    }

    @GetMapping("/farms")
    public List<Farm> farmList(){
        return farmService.getAllFarms();
    }

    @GetMapping("/farm/{id}")
    public Farm getFarmById(@PathVariable ("id") Long id){
        return farmService.getFarmById(id);
    }

    @PutMapping("/update/farm/{id}")
    public Farm updateFarm(@PathVariable ("id") Long id, @RequestBody Farm farm) {
        return farmService.updateFarm(id, farm);
    }

    @DeleteMapping("/delete/farm/{id}")
    public void removeById(@PathVariable ("id") Long id){
        farmService.removeFarm(id);
    }
}
