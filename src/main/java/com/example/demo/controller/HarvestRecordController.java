package com.example.demo.controller;

import com.example.demo.model.HarvestRecord;
import com.example.demo.service.HarvestRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class HarvestRecordController {

    private final HarvestRecordService harvestRecordService;

    @Autowired
    public HarvestRecordController(HarvestRecordService harvestRecordService) {
        this.harvestRecordService = harvestRecordService;
    }

    @PostMapping("/harvestRecord/{batchId}")
    public HarvestRecord saveHarvestRecord(@RequestBody HarvestRecord harvestRecord, @PathVariable ("batchId") Long batchId){
        return harvestRecordService.saveHarvestRecord(harvestRecord, batchId);
    }

    @GetMapping("/harvestRecords")
    public List<HarvestRecord> harvestRecordList() {
        return harvestRecordService.getAllHarvestRecords();
    }
}
