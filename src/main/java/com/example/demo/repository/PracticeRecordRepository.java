package com.example.demo.repository;

import com.example.demo.model.PracticeRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRecordRepository extends JpaRepository <PracticeRecord, Long> {
}
