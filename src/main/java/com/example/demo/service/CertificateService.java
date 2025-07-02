package com.example.demo.service;

import com.example.demo.model.Certificate;

import java.util.List;

public interface CertificateService {
    List<Certificate> getAllCertificates();
    Certificate getCertificateById(Long id);
    Certificate saveCertificate(Certificate certificate, Long farmId);
    Certificate updateCertificate(Long id, Certificate certificate);
    void removeCertificate(Long id);
}
