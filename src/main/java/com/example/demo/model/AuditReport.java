package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditReport {
    @Id
    @GeneratedValue
    private Long id;

    private String auditorName;
    private LocalDate auditDate;
    private String reportUrl;
    private boolean passed;

    @ManyToOne
    private Farm farm;
}
