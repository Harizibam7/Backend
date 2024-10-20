package com.project.dashboard.repository;

import com.project.dashboard.model.ActivityPlacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityPlacementRepository extends JpaRepository<ActivityPlacement, Integer> {

    // Custom query methods
}