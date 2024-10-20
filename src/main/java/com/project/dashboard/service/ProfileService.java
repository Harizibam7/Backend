package com.project.dashboard.service;

import com.project.dashboard.model.Profile;
import com.project.dashboard.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Optional<Profile> getProfileById(Integer id) {
        return profileRepository.findById(id);
    }

    public List<Profile> getProfilesByUserId(Integer userId) {
        return profileRepository.findByUserId(userId);
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public void deleteProfile(Integer id) {
        profileRepository.deleteById(id);
    }
}
