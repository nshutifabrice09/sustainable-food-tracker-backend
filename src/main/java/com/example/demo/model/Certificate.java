package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "certificates")
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String issuingOrganization;
    private LocalDate issuedDate;
    private LocalDate expiryDate;
    private String documentUrl;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;
}
