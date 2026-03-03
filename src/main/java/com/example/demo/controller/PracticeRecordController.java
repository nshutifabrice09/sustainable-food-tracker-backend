package com.example.demo.controller;

import com.example.demo.model.PracticeRecord;
import com.example.demo.service.PracticeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class PracticeRecordController {

    private final PracticeRecordService practiceRecordService;

    @Autowired
    public PracticeRecordController(PracticeRecordService practiceRecordService) {
        this.practiceRecordService = practiceRecordService;
    }

    @PostMapping("/practiceRecord/{batchId}")
    public PracticeRecord savePracticeRecord(@RequestBody PracticeRecord practiceRecord, @PathVariable ("batch_id") Long batchId) {
        return practiceRecordService.savePracticeRecord(practiceRecord, batchId);
    }

    @GetMapping("/practiceRecords")
    public List<PracticeRecord> practiceRecordList() {
        return practiceRecordService.getAllPracticeRecords();
    }
}
