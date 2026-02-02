package com.isitmez.stocktracker.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
@Entity
@Table(name = "stocks")
@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double buyPrice;

    @Column(nullable = false)
    private int quantity;

    private double currentPrice;

    private double profitLoss;
    private LocalDateTime purchaseDate;
}