package com.example.demo.controller;


import com.example.demo.model.AuditReport;
import com.example.demo.service.AuditReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class AuditReportController {

    private final AuditReportService auditReportService;

    @Autowired
    public AuditReportController(AuditReportService auditReportService) {
        this.auditReportService = auditReportService;
    }

    @PostMapping("/auditReport/farmId")
    public AuditReport saveAuditReport(@RequestBody AuditReport auditReport, @PathVariable ("farmId") Long farmId){
        return auditReportService.saveAuditReport(auditReport, farmId);
    }

    @GetMapping("/auditReports")
    public List<AuditReport> AuditReportList(){
        return auditReportService.getAllAuditReports();
    }

    @GetMapping("/auditReport/{id}")
    public AuditReport getAuditReportById(@PathVariable ("id") Long id){
        return auditReportService.getAuditReportById(id);
    }

    @PutMapping("/update/auditReport/{id}")
    public AuditReport updateAuditReport(@PathVariable ("id") Long id, @RequestBody AuditReport auditReport){
        return auditReportService.updateAuditReport(id, auditReport);
    }

    @DeleteMapping("/delete/auditReport/{delete}")
    public void deleteAuditReport(@PathVariable ("id") Long id){
        auditReportService.removeAuditReport(id);
    }
}
