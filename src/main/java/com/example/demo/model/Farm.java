package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Farm {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String location;
    private String certificationId;

    private boolean verified;

    @ManyToOne
    private User owner;
}