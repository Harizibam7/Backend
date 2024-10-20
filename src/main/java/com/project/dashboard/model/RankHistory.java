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
@Table(name = "Rank_History")
public class RankHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "roll_no")
    private Integer rollNo;

    private String description;
    private Integer point;

    @Temporal(TemporalType.DATE)
    private Date date;
}
