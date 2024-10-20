package com.project.dashboard.service;

import com.project.dashboard.model.PlacementContest;
import com.project.dashboard.repository.PlacementContestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlacementContestService {

    @Autowired
    private PlacementContestRepository placementContestRepository;

    public PlacementContest createPlacementContest(PlacementContest placementContest) {
        return placementContestRepository.save(placementContest);
    }

    public Optional<PlacementContest> getPlacementContestById(Integer id) {
        return placementContestRepository.findById(id);
    }

    public List<PlacementContest> getPlacementContestsByBatch(String batch) {
        return placementContestRepository.findByBatch(batch);
    }

    public List<PlacementContest> getAllPlacementContests() {
        return placementContestRepository.findAll();
    }

    public void deletePlacementContest(Integer id) {
        placementContestRepository.deleteById(id);
    }
}
