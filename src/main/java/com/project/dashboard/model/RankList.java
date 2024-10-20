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
@Table(name = "Rank_List")
public class RankList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "rank_value")  // Renamed from 'rank' to avoid using reserved keywords
    private Integer rankValue;

    @Column(name = "roll_no")
    private Integer rollNo;

    @Column(name = "rank_point")
    private Integer rankPoint;
}

