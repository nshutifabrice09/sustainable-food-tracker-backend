package com.example.demo.service;

import com.example.demo.model.Certificate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImplementation implements CertificateService{

    @Override
    public List<Certificate> getAllCertificates() {
        return null;
    }

    @Override
    public Certificate getCertificateById(Long id) {
        return null;
    }

    @Override
    public Certificate saveCertificate(Certificate certificate, Long farmId) {
        return null;
    }

    @Override
    public Certificate updateCertificate(Long id, Certificate certificate) {
        return null;
    }

    @Override
    public void removeCertificate(Long id) {

    }
}
