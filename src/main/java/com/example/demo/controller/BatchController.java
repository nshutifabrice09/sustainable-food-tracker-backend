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

    @GetMapping("/bacth/{id}")
    public Batch getBatchById(@PathVariable ("id") Long id){
        return batchService.getBatchById(id);
    }

    @PutMapping("/update/batch/{id}")
    public Batch updateBatch(@PathVariable ("id") Long id, @RequestBody Batch batch){
        return batchService.updateBatch(id, batch);
    }

    @DeleteMapping("/delete/batch/{id}")
    public void deleteBatch(@PathVariable ("id") Long id){
        batchService.removeBatch(id);
    }
}
