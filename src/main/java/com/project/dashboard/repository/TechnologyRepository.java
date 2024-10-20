package com.project.dashboard.repository;

import com.project.dashboard.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

    // Custom query methods
}