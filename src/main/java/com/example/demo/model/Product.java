package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;

    private String unitOfMeasurement;
}
