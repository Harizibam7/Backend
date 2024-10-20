package com.project.dashboard.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Placement_Experience")
public class PlacementExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "roll_no")
    private Integer rollNo;

    @Column(name = "drive_link")
    private String driveLink;

    @Temporal(TemporalType.DATE)
    private Date date;
}

