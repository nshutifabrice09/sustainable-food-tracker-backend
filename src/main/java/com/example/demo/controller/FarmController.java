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
}
