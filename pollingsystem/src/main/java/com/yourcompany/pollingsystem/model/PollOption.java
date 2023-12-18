package com.yourcompany.pollingsystem.model;

import javax.persistence.*;

@Entity
public class PollOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String optionText;
    @ManyToOne
    @JoinColumn(name = "poll_id")
    private Poll poll;

    // Getters et Setters
}
