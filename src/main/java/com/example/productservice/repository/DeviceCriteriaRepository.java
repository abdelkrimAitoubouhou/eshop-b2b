package com.example.productservice.repository;

import com.example.productservice.entities.Device;
import com.example.productservice.entities.DeviceCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceCriteriaRepository extends JpaRepository<DeviceCriteria, Long> {
}
