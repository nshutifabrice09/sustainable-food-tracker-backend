package com.example.demo.service;

import com.example.demo.model.AuditReport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditReportServiceImplementation implements AuditReportService{
    @Override
    public List<AuditReport> getAllAuditReports() {
        return null;
    }

    @Override
    public AuditReport getAuditReportById(Long id) {
        return null;
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
