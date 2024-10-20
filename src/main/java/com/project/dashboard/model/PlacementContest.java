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
@Table(name = "Placement_Contest")
public class PlacementContest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String batch;
    private Integer company;
    private Integer offers;
    private Integer students;

    @Column(name = "result_awaiting")
    private Integer resultAwaiting;
}
