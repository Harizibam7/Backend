package com.project.dashboard.service;

import com.project.dashboard.model.RankHistory;
import com.project.dashboard.repository.RankHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RankHistoryService {

    @Autowired
    private RankHistoryRepository rankHistoryRepository;

    public RankHistory createRankHistory(RankHistory rankHistory) {
        return rankHistoryRepository.save(rankHistory);
    }

    public Optional<RankHistory> getRankHistoryById(Integer id) {
        return rankHistoryRepository.findById(id);
    }

    public List<RankHistory> getRankHistoriesByRollNo(Integer rollNo) {
        return rankHistoryRepository.findByRollNo(rollNo);
    }

    public List<RankHistory> getAllRankHistories() {
        return rankHistoryRepository.findAll();
    }

    public void deleteRankHistory(Integer id) {
        rankHistoryRepository.deleteById(id);
    }
}
