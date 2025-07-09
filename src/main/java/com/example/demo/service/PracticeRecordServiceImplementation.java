package com.example.demo.service;

import com.example.demo.model.PracticeRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticeRecordServiceImplementation implements PracticeRecordService{
    @Override
    public List<PracticeRecord> getAllPracticeRecords() {
        return null;
    }

    @Override
    public PracticeRecord getPracticeRecordById(Long id) {
        return null;
    }

    @Override
    public PracticeRecord savePracticeRecord(PracticeRecord practiceRecord, Long batchId) {
        return null;
    }

    @Override
    public PracticeRecord updatePracticeRecord(Long id, PracticeRecord practiceRecord) {
        return null;
    }

    @Override
    public void removePracticeRecord(Long id) {

    }
}
