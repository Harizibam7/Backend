package com.project.dashboard.service;

import com.project.dashboard.model.Coding;
import com.project.dashboard.repository.CodingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CodingService {

    @Autowired
    private CodingRepository codingRepository;

    public Coding createCoding(Coding coding) {
        return codingRepository.save(coding);
    }

    public Optional<Coding> getCodingById(Integer id) {
        return codingRepository.findById(id);
    }

    public List<Coding> getCodingsByLeetcodeRating(Integer rating) {
        return codingRepository.findByLeetcodeRatingGreaterThan(rating);
    }

    public List<Coding> getCodingsByCodechefRating(Integer rating) {
        return codingRepository.findByCodechefRatingGreaterThan(rating);
    }

    public List<Coding> getAllCodings() {
        return codingRepository.findAll();
    }

    public void deleteCoding(Integer id) {
        codingRepository.deleteById(id);
    }
}

