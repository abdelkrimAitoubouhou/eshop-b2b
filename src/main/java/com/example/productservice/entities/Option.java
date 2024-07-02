package com.example.productservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**/
@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Option {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icone;
    private String title;
    private String description;
    private BigDecimal price;
    private Boolean enabled;
    private Boolean show_price;
    @Column(name = "\"VALUE\"")
    private String value;


    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "product")
    private Product product;


}

