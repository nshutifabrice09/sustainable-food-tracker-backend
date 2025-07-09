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

    
}
