package com.example.productservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**/
@Data
@NoArgsConstructor @AllArgsConstructor
@Entity

public class Attribute {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String icone;
    private String description;
    @Column(name = "\"VALUE\"")
    private String value;
    private Integer position;
    private Boolean principal;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "product")
    private Product product;

}

