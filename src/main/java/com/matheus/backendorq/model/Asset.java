package com.matheus.backendorq.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Asset {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String symbol;

    @Column(length = 10, nullable = false)
    private String decimalPrecision;

    @Column(length = 10)
    private String tradingSupported;

    @Column(length = 100)
    private String explorerUrl;

}
