package com.example.demo.controller;

import com.example.demo.model.Batch;
import com.example.demo.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class BatchController {

    private final BatchService batchService;

    @Autowired
    public BatchController(BatchService batchService) {
        this.batchService = batchService;
    }

    @PostMapping("/batch/{productId}/{farmId}")
    public Batch saveBatch(@RequestBody Batch batch, @PathVariable ("productId") Long productId,
                                                    @PathVariable ("farmId") Long farmId){
        return batchService.saveBatch(batch, productId, farmId);
    }

    @GetMapping("/batches")
    public List<Batch> batchList(){
        return batchService.getAllBatches();
    }
}
