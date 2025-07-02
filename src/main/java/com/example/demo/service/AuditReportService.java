package com.example.demo.service;

import com.example.demo.model.AuditReport;

import java.util.List;

public interface AuditReportService {
    List<AuditReport> getAllAuditReports();
    AuditReport getAuditReportById(Long id);
    AuditReport saveAuditReport(AuditReport auditReport, Long farmId);
    AuditReport updateAuditReport(Long id, AuditReport auditReport);
    void removeAuditReport(Long id);
}
