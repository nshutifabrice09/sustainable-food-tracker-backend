package com.example.demo.service;

import com.example.demo.model.Certificate;
import com.example.demo.model.Farm;
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
        Farm farm = farmRepository.findFarmById(farmId);
        certificate.setFarm(farm);
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate updateCertificate(Long id, Certificate certificate) {
        Certificate existCertificate = certificateRepository.findCertificateById(id);
        if(existCertificate != null){
            existCertificate.setTitle(certificate.getTitle());
            existCertificate.setIssuingOrganization(certificate.getIssuingOrganization());
            existCertificate.setIssuedDate(certificate.getIssuedDate());
            existCertificate.setDocumentUrl(certificate.getDocumentUrl());
            return certificateRepository.save(existCertificate);
        }
        return null;
    }

    @Override
    public void removeCertificate(Long id) {
        certificateRepository.deleteById(id);
    }
}
