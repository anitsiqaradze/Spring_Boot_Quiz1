package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    private String category;

    private LocalDateTime createdAt;

    // @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    // private List<Review> reviews;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

}