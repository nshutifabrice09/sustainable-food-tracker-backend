package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "practice_records")
@NoArgsConstructor
@AllArgsConstructor
public class PracticeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String practiceType; // e.g. Organic fertilizer
    private String description;

    private LocalDate dateApplied;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
}
