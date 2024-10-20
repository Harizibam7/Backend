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
@Table(name = "Activity_Placement")
public class ActivityPlacement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "event_name")
    private String eventName;

    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "from_date")
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "to_date")
    private Date toDate;
}
