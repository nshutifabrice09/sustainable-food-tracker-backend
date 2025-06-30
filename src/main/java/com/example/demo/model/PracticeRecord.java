package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PracticeRecord {
    @Id
    @GeneratedValue
    private Long id;

    private String practiceType; // e.g. Organic fertilizer
    private String description;

    private LocalDate dateApplied;

    @ManyToOne
    private Batch batch;
}
