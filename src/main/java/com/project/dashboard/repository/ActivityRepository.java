package com.project.dashboard.repository;

import com.project.dashboard.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository  extends JpaRepository<ActivityRepository,Integer> {

}
