package com.project.dashboard.repository;

import com.project.dashboard.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Integer> {
    List<Profile> findByUserId(Integer id);
}
