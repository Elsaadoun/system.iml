package com.yourcompany.pollingsystem.model;

import javax.persistence.*;

@Entity
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long pollId;
    private String selectedOption;

    // Getters and Setters
}
