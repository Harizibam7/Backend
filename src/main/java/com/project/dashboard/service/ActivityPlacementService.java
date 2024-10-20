package com.project.dashboard.service;

import com.project.dashboard.model.ActivityPlacement;
import com.project.dashboard.repository.ActivityPlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ActivityPlacementService {

    @Autowired
    private ActivityPlacementRepository activityPlacementRepository;

    public ActivityPlacement createActivityPlacement(ActivityPlacement activityPlacement) {
        return activityPlacementRepository.save(activityPlacement);
    }

    public Optional<ActivityPlacement> getActivityPlacementById(Integer id) {
        return activityPlacementRepository.findById(id);
    }

    public List<ActivityPlacement> getAllActivityPlacements() {
        return activityPlacementRepository.findAll();
    }

    public void deleteActivityPlacement(Integer id) {
        activityPlacementRepository.deleteById(id);
    }
}

