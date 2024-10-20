package com.project.dashboard.repository;

import com.project.dashboard.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Integer> {

    // Custom query methods
    List<Leave> findByUserId(Integer userId);

    List<Leave> findByRollNo(Integer rollNo);
}