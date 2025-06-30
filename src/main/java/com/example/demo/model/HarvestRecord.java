package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HarvestRecord {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate harvestDate;
    private double yieldAmount;

    private String method; // e.g. Manual, Mechanical

    @ManyToOne
    private Batch batch;
}
