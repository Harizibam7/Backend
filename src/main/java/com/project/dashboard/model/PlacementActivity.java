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
@Table(name = "Placement_Activity")
public class PlacementActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "activity_1_id")
    private ActivityPlacement activity1;

    @ManyToOne
    @JoinColumn(name = "activity_2_id")
    private ActivityPlacement activity2;

    @ManyToOne
    @JoinColumn(name = "activity_3_id")
    private ActivityPlacement activity3;

    @ManyToOne
    @JoinColumn(name = "activity_4_id")
    private ActivityPlacement activity4;

    @ManyToOne
    @JoinColumn(name = "activity_5_id")
    private ActivityPlacement activity5;
}
