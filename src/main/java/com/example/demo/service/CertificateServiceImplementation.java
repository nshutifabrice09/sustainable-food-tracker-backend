package com.example.demo.service;

import com.example.demo.model.Certificate;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateServiceImplementation implements CertificateService{

    private final CertificateRepository certificateRepository;
    private final FarmRepository farmRepository;

    @Autowired
    public CertificateServiceImplementation(CertificateRepository certificateRepository, FarmRepository farmRepository) {
        this.certificateRepository = certificateRepository;
        this.farmRepository = farmRepository;
    }


    @Override
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    @Override
    public Certificate getCertificateById(Long id) {
        return certificateRepository.findCertificateById(id);
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
