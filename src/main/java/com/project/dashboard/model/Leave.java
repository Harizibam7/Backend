package com.project.dashboard.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "`Leave`")  // Escaping the 'Leave' keyword
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "roll_no")
    private Integer rollNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "from_date")
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "from_time")
    private Timestamp fromTime;

    @Column(name = "to_time")
    private Timestamp toTime;

    private String reason;
    private Boolean status;
}

