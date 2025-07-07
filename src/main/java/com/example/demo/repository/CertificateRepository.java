package com.example.demo.repository;

import com.example.demo.model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CertificateRepository extends JpaRepository <Certificate, Long> {
    Certificate findCertificateById(Long id);
}
