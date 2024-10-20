package com.project.dashboard.repository;


import com.project.dashboard.model.RankHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankHistoryRepository extends JpaRepository<RankHistory, Integer> {

    // Custom query methods
    List<RankHistory> findByRollNo(Integer rollNo);
}
