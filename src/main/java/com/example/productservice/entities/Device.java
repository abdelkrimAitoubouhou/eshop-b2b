package com.example.productservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**/
@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Device {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String icone;
    private String description;
    private Boolean enabled;
    private String code;



    @OneToMany (mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DeviceCriteria> deviceCriteria = new ArrayList<>();




}

