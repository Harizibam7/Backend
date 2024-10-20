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
@Table(name = "Coding")
public class Coding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "leetcode_rating")
    private Integer leetcodeRating;

    @Column(name = "leetcode_count")
    private Integer leetcodeCount;

    @Column(name = "codechef_rating")
    private Integer codechefRating;

    @Column(name = "codechef_count")
    private Integer codechefCount;

    @Column(name = "codeforce_rating")
    private Integer codeforceRating;

    @Column(name = "codeforce_count")
    private Integer codeforceCount;
}
