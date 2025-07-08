package com.example.demo.service;

import com.example.demo.model.HarvestRecord;

import java.util.List;

public interface HarvestRecordService {
    List<HarvestRecord> getAllHarvestRecords();
    HarvestRecord getHarvestRecordById(Long id);
    HarvestRecord saveHarvestRecord(HarvestRecord harvestRecord, Long batchId);
    HarvestRecord updateHarvestRecord(Long id, HarvestRecord harvestRecord);
    void removeHarvestRecord (Long id);

}
