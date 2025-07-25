package com.example.demo.repository;

import com.example.demo.model.TransportLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportLogRepository extends JpaRepository <TransportLog, Long> {
    TransportLog findTransportLogById(Long id);
}
