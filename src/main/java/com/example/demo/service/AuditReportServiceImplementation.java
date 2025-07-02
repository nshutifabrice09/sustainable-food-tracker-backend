package com.example.demo.service;

import com.example.demo.model.AuditReport;
import com.example.demo.model.Farm;
import com.example.demo.repository.AuditReportRepository;
import com.example.demo.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditReportServiceImplementation implements AuditReportService{

    private final AuditReportRepository auditReportRepository;
    private final FarmRepository farmRepository;

    @Autowired
    public AuditReportServiceImplementation(AuditReportRepository auditReportRepository, FarmRepository farmRepository){
        this.auditReportRepository = auditReportRepository;
        this.farmRepository= farmRepository;
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
        Farm farm = farmRepository.findFarmById(farmId);
        auditReport.setFarm(farm);
        return auditReportRepository.save(auditReport);
    }

    @Override
    public AuditReport updateAuditReport(Long id, AuditReport auditReport) {
        AuditReport existAuditReport = auditReportRepository.findAuditReportById(id);
        if(existAuditReport != null){
            existAuditReport.setAuditorName(auditReport.getAuditorName());
            existAuditReport.setAuditDate(auditReport.getAuditDate());
            existAuditReport.setReportUrl(auditReport.getReportUrl());
            existAuditReport.setPassed(auditReport.isPassed());
            return auditReportRepository.save(existAuditReport);
        }
        return null;
    }

    @Override
    public void removeAuditReport(Long id) {
        auditReportRepository.deleteById(id);
    }
}
