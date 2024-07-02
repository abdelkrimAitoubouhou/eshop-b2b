package com.example.productservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;
    private  String sub_title;
    private  String sub_mention;
    private BigDecimal price;
    private BigDecimal fms;
    private BigDecimal fmd;
    private Boolean enabled;

    @OneToMany (mappedBy = "product",
            cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Attribute> attributes = new ArrayList<>();;

    @OneToMany (mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Option> options = new ArrayList<>();
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "familyProduct")
    private FamilyProduct familyProduct;
}
