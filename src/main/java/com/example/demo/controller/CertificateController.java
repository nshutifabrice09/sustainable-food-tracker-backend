package com.example.demo.controller;

import com.example.demo.model.Certificate;
import com.example.demo.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class CertificateController {
    private final CertificateService certificateService;

    @Autowired
    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping("/certificate/{farm_id}")
    public Certificate saveCertificate(@RequestBody Certificate certificate, @PathVariable ("farm_id") Long farmId) {
        return certificateService.saveCertificate(certificate, farmId);
    }
}
