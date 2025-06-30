package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransportLog {
    @Id @GeneratedValue
    private Long id;

    private LocalDate shippedAt;
    private LocalDate receivedAt;
    private String origin;
    private String destination;

    private String transporter;

    @ManyToOne
    private Batch batch;
}
