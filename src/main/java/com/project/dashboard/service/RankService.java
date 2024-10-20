package com.project.dashboard.service;

import com.project.dashboard.model.Rank;
import com.project.dashboard.repository.RankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RankService {

    @Autowired
    private RankRepository rankRepository;

    public Rank createRank(Rank rank) {
        return rankRepository.save(rank);
    }

    public Optional<Rank> getRankById(Integer id) {
        return rankRepository.findById(id);
    }

    public List<Rank> getAllRanks() {
        return rankRepository.findAll();
    }

    public void deleteRank(Integer id) {
        rankRepository.deleteById(id);
    }
}

