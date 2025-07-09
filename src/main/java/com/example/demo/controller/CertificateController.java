package com.example.demo.controller;

import com.example.demo.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class CertificateController {

    private final CertificateService certificateService;


    @Autowired
    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }
}
