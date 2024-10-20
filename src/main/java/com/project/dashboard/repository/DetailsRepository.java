package com.project.dashboard.repository;

import com.project.dashboard.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {
    Details findByRollNo(String rollNo);
    Details findByMailId(String mailId);
}
