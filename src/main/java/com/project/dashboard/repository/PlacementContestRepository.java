package com.project.dashboard.repository;

import com.project.dashboard.model.PlacementContest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlacementContestRepository extends JpaRepository<PlacementContest, Integer> {

    // Custom query methods
    List<PlacementContest> findByBatch(String batch);
}