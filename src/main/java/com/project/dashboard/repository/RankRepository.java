package com.project.dashboard.repository;

import com.project.dashboard.model.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RankRepository extends JpaRepository<Rank, Integer> {

    // Custom query methods
}