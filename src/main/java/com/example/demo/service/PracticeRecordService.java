package com.example.demo.service;

import com.example.demo.model.PracticeRecord;

import java.util.List;

public interface PracticeRecordService {
    List<PracticeRecord> getAllPracticeRecords();
    PracticeRecord getPracticeRecordById(Long id);
    PracticeRecord savePracticeRecord (PracticeRecord practiceRecord, Long batchId);
    PracticeRecord updatePracticeRecord (Long id, PracticeRecord practiceRecord);
    void removePracticeRecord(Long id);
}
