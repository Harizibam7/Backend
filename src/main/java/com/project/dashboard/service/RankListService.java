package com.project.dashboard.service;

import com.project.dashboard.model.RankList;
import com.project.dashboard.repository.RankListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RankListService {

    @Autowired
    private RankListRepository rankListRepository;

    public RankList createRankList(RankList rankList) {
        return rankListRepository.save(rankList);
    }

    public Optional<RankList> getRankListById(Integer id) {
        return rankListRepository.findById(id);
    }

    public List<RankList> getRankListsByRollNo(Integer rollNo) {
        return rankListRepository.findByRollNo(rollNo);
    }

    public List<RankList> getAllRankLists() {
        return rankListRepository.findAll();
    }

    public void deleteRankList(Integer id) {
        rankListRepository.deleteById(id);
    }
}
