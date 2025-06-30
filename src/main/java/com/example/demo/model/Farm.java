package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "farms")
@NoArgsConstructor
@AllArgsConstructor
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String certificationId;

    private boolean verified;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
}