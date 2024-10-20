package com.project.dashboard.repository;

import com.project.dashboard.model.Coding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CodingRepository extends JpaRepository<Coding, Integer> {
    List<Coding> findByLeetcodeRatingGreaterThan(Integer rating);
    List<Coding> findByCodechefRatingGreaterThan(Integer rating);
}
