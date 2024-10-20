package com.project.dashboard.service;

import com.project.dashboard.model.Technology;
import com.project.dashboard.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    public Technology createTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    public Optional<Technology> getTechnologyById(Integer id) {
        return technologyRepository.findById(id);
    }

    public List<Technology> getAllTechnologies() {
        return technologyRepository.findAll();
    }

    public void deleteTechnology(Integer id) {
        technologyRepository.deleteById(id);
    }
}
