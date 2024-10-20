package com.project.dashboard.repository;

import com.project.dashboard.model.PlacementExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlacementExperienceRepository extends JpaRepository<PlacementExperience, Integer> {

    // Custom query methods
    List<PlacementExperience> findByUserId(Integer userId);

    List<PlacementExperience> findByRollNo(Integer rollNo);
}
