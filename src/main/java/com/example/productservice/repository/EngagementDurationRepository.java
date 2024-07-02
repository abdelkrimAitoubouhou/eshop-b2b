package com.example.productservice.repository;

import com.example.productservice.entities.EngagementDuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngagementDurationRepository extends JpaRepository<EngagementDuration, Long> {
}
