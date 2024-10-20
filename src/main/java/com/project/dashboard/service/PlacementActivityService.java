package com.project.dashboard.service;

import com.project.dashboard.model.PlacementActivity;
import com.project.dashboard.repository.PlacementActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlacementActivityService {

    @Autowired
    private PlacementActivityRepository placementActivityRepository;

    public PlacementActivity createPlacementActivity(PlacementActivity placementActivity) {
        return placementActivityRepository.save(placementActivity);
    }

    public Optional<PlacementActivity> getPlacementActivityById(Integer id) {
        return placementActivityRepository.findById(id);
    }

    public List<PlacementActivity> getAllPlacementActivities() {
        return placementActivityRepository.findAll();
    }

    public void deletePlacementActivity(Integer id) {
        placementActivityRepository.deleteById(id);
    }
}
