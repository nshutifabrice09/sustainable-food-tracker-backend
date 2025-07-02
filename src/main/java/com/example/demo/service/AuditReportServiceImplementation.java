package com.example.demo.service;

import com.example.demo.model.AuditReport;
import com.example.demo.repository.AuditReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditReportServiceImplementation implements AuditReportService{

    private final AuditReportRepository auditReportRepository;

    @Autowired
    public AuditReportServiceImplementation(AuditReportRepository auditReportRepository){
        this.auditReportRepository = auditReportRepository;
    }

    @Override
    public List<AuditReport> getAllAuditReports() {
        return auditReportRepository.findAll();
    }

    @Override
    public AuditReport getAuditReportById(Long id) {
        return auditReportRepository.findAuditReportById(id);
    }

    @Override
    public AuditReport saveAuditReport(AuditReport auditReport, Long farmId) {
        return null;
    }

    @Override
    public AuditReport updateAuditReport(Long id, AuditReport auditReport) {
        return null;
    }

    @Override
    public void removeAuditReport(Long id) {

    }
}
