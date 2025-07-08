package com.example.demo.service;

import com.example.demo.model.HarvestRecord;
import com.example.demo.repository.BatchRepository;
import com.example.demo.repository.HarvestRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarvestRecordServiceImplementation implements HarvestRecordService{

    private final HarvestRecordRepository harvestRecordRepository;
    private final BatchRepository batchRepository;

    @Autowired
    public HarvestRecordServiceImplementation(HarvestRecordRepository harvestRecordRepository, BatchRepository batchRepository) {
        this.harvestRecordRepository = harvestRecordRepository;
        this.batchRepository = batchRepository;
    }


    @Override
    public List<HarvestRecord> getAllHarvestRecords() {
        return harvestRecordRepository.findAll();
    }

    @Override
    public HarvestRecord getHarvestRecordById(Long id) {
        return harvestRecordRepository.findHarvestRecordById(id);
    }

    @Override
    public HarvestRecord saveHarvestRecord(HarvestRecord harvestRecord, Long batchId) {
        return null;
    }

    @Override
    public HarvestRecord updateHarvestRecord(Long id, HarvestRecord harvestRecord) {
        return null;
    }

    @Override
    public void removeHarvestRecord(Long id) {

    }
}
