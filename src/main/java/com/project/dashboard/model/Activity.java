package com.project.dashboard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer fa;
    private Integer attendance;
    private Integer cLevel;
    private Integer dsLevel;
    private Integer psLevel;
    private Integer fullstack;

    @Column(name = "resume_link")
    private String resumeLink;

    @Column(name = "company_attended")
    private Integer companyAttended;

    @Column(name = "company_rejected")
    private Integer companyRejected;

    @Column(name = "company_skipped")
    private Integer companySkipped;
}
