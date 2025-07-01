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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(LocalDate harvestDate) {
        this.harvestDate = harvestDate;
    }

    public double getYieldAmount() {
        return yieldAmount;
    }

    public void setYieldAmount(double yieldAmount) {
        this.yieldAmount = yieldAmount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
