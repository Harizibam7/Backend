package com.project.dashboard.service;

import com.project.dashboard.model.Activity;
import com.project.dashboard.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    public Optional<Activity> getActivityById(Integer id) {
        return activityRepository.findById(id);
    }

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public void deleteActivity(Integer id) {
        activityRepository.deleteById(id);
    }
}
