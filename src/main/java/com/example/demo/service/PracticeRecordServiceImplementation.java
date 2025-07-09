package com.example.demo.service;

import com.example.demo.model.Batch;
import com.example.demo.model.PracticeRecord;
import com.example.demo.repository.BatchRepository;
import com.example.demo.repository.PracticeRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticeRecordServiceImplementation implements PracticeRecordService{

    private final PracticeRecordRepository practiceRecordRepository;
    private final BatchRepository batchRepository;

    @Autowired
    public PracticeRecordServiceImplementation(PracticeRecordRepository practiceRecordRepository, BatchRepository batchRepository) {
        this.practiceRecordRepository = practiceRecordRepository;
        this.batchRepository = batchRepository;
    }

    @Override
    public List<PracticeRecord> getAllPracticeRecords() {
        return practiceRecordRepository.findAll();
    }

    @Override
    public PracticeRecord getPracticeRecordById(Long id) {
        return practiceRecordRepository.findPracticeRecordById(id);
    }

    @Override
    public PracticeRecord savePracticeRecord(PracticeRecord practiceRecord, Long batchId) {
        Batch batch = batchRepository.findBatchById(batchId);
        practiceRecord.setBatch(batch);
        return practiceRecordRepository.save(practiceRecord);
    }

    @Override
    public PracticeRecord updatePracticeRecord(Long id, PracticeRecord practiceRecord) {
        PracticeRecord existPracticeRecord = practiceRecordRepository.findPracticeRecordById(id);
        if(existPracticeRecord != null){
            existPracticeRecord.setPracticeType(practiceRecord.getPracticeType());
            existPracticeRecord.setDescription(practiceRecord.getDescription());
            existPracticeRecord.setDateApplied(practiceRecord.getDateApplied());
            return practiceRecordRepository.save(existPracticeRecord);
        }
        return null;
    }

    @Override
    public void removePracticeRecord(Long id) {
        practiceRecordRepository.deleteById(id);
    }
}
