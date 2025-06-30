package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "transport_logs")
@NoArgsConstructor
@AllArgsConstructor
public class TransportLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate shippedAt;
    private LocalDate receivedAt;
    private String origin;
    private String destination;

    private String transporter;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    private Batch batch;
}
