package com.project.dashboard.repository;


import com.project.dashboard.model.PlacementActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementActivityRepository extends JpaRepository<PlacementActivity, Integer> {

    // Custom query methods
}