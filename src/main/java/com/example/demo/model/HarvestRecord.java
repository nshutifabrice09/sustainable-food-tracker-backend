package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "harvest_records")
@NoArgsConstructor
@AllArgsConstructor
public class HarvestRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate harvestDate;
    private double yieldAmount;

    private String method; // e.g. Manual, Mechanical

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
}
