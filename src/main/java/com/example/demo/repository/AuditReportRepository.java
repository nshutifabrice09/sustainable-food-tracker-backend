package com.example.demo.repository;

import com.example.demo.model.AuditReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditReportRepository extends JpaRepository <AuditReport, Long> {
    AuditReport findAuditReportById(Long id);
}
