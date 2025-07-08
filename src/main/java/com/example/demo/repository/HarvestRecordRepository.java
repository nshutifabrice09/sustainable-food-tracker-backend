package com.example.demo.repository;

import com.example.demo.model.HarvestRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarvestRecordRepository extends JpaRepository <HarvestRecord, Long> {
    HarvestRecord findHarvestRecordById(Long id);
}
