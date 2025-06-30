package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "audit_reports")
@NoArgsConstructor
@AllArgsConstructor
public class AuditReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String auditorName;
    private LocalDate auditDate;
    private String reportUrl;
    private boolean passed;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;
}
