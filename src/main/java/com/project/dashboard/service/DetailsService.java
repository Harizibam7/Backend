package com.project.dashboard.service;

import com.project.dashboard.model.Details;
import com.project.dashboard.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DetailsService {

    @Autowired
    private DetailsRepository detailsRepository;

    public Details createDetails(Details details) {
        return detailsRepository.save(details);
    }

    public Optional<Details> getDetailsById(Integer id) {
        return detailsRepository.findById(id);
    }

    public Details getDetailsByRollNo(String rollNo) {
        return detailsRepository.findByRollNo(rollNo);
    }

    public Details getDetailsByMailId(String mailId) {
        return detailsRepository.findByMailId(mailId);
    }

    public List<Details> getAllDetails() {
        return detailsRepository.findAll();
    }

    public void deleteDetails(Integer id) {
        detailsRepository.deleteById(id);
    }
}
