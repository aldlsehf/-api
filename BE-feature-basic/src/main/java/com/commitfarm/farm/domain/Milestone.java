package com.commitfarm.farm.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Milestone")
@Getter
@Setter
@NoArgsConstructor
public class Milestone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long milestoneId;

    private String name;

    private LocalDate startDate;

    private LocalDate dueDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "milestone")
    private List<Ticket> tickets;
}
