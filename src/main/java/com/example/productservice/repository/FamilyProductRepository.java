package com.example.productservice.repository;

import com.example.productservice.entities.FamilyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyProductRepository extends JpaRepository<FamilyProduct, Long> {
}
