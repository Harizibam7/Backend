package com.project.dashboard.service;

import com.project.dashboard.model.Leave;
import com.project.dashboard.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LeaveService {

    @Autowired
    private LeaveRepository leaveRepository;

    public Leave createLeave(Leave leave) {
        return leaveRepository.save(leave);
    }

    public Optional<Leave> getLeaveById(Integer id) {
        return leaveRepository.findById(id);
    }

    public List<Leave> getLeavesByUserId(Integer userId) {
        return leaveRepository.findByUserId(userId);
    }

    public List<Leave> getLeavesByRollNo(Integer rollNo) {
        return leaveRepository.findByRollNo(rollNo);
    }

    public List<Leave> getAllLeaves() {
        return leaveRepository.findAll();
    }

    public void deleteLeave(Integer id) {
        leaveRepository.deleteById(id);
    }
}
