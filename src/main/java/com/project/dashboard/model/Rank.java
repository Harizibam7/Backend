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
@Table(name = "`Rank`")  // Escaping the 'Rank' keyword
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "rank_list_id")
    private RankList rankList;

    @ManyToOne
    @JoinColumn(name = "rank_history_id")
    private RankHistory rankHistory;
}
