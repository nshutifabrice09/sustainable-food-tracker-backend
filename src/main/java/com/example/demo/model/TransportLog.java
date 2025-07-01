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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getShippedAt() {
        return shippedAt;
    }

    public void setShippedAt(LocalDate shippedAt) {
        this.shippedAt = shippedAt;
    }

    public LocalDate getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(LocalDate receivedAt) {
        this.receivedAt = receivedAt;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
