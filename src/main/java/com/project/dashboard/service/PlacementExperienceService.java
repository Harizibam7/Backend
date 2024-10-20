package com.project.dashboard.service;

import com.project.dashboard.model.PlacementExperience;
import com.project.dashboard.repository.PlacementExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlacementExperienceService {

    @Autowired
    private PlacementExperienceRepository placementExperienceRepository;

    public PlacementExperience createPlacementExperience(PlacementExperience placementExperience) {
        return placementExperienceRepository.save(placementExperience);
    }

    public Optional<PlacementExperience> getPlacementExperienceById(Integer id) {
        return placementExperienceRepository.findById(id);
    }

    public List<PlacementExperience> getPlacementExperiencesByUserId(Integer userId) {
        return placementExperienceRepository.findByUserId(userId);
    }

    public List<PlacementExperience> getPlacementExperiencesByRollNo(Integer rollNo) {
        return placementExperienceRepository.findByRollNo(rollNo);
    }

    public List<PlacementExperience> getAllPlacementExperiences() {
        return placementExperienceRepository.findAll();
    }

    public void deletePlacementExperience(Integer id) {
        placementExperienceRepository.deleteById(id);
    }
}
