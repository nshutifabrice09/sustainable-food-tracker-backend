package com.example.demo.controller;

import com.example.demo.model.Certificate;
import com.example.demo.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CertificateController {
    private final CertificateService certificateService;

    @Autowired
    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping("/certificate/{farmId}")
    public Certificate saveCertificate(@RequestBody Certificate certificate, @PathVariable ("farmId") Long farmId) {
        return certificateService.saveCertificate(certificate, farmId);
    }

    @GetMapping("/certificates")
    public List<Certificate> certificateList() {
        return certificateService.getAllCertificates();
    }
}
