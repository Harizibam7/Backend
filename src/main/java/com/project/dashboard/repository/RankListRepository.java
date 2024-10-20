package com.project.dashboard.repository;

import com.project.dashboard.model.RankList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankListRepository extends JpaRepository<RankList, Integer> {

    // Custom query methods
    List<RankList> findByRollNo(Integer rollNo);
}
