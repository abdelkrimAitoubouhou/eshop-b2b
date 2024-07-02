package com.example.productservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class DeviceCriteria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icone;
    private String label;
    @Column(name = "\"VALUE\"")
    private String value;
    private Boolean enabled;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "device")
    private Device device;


}

