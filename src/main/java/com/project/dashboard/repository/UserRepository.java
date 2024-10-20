package com.project.dashboard.repository;

import com.project.dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
    List<User> findByStatus(Boolean status);
}
