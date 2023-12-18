package com.yourcompany.pollingsystem.repository;

import com.yourcompany.pollingsystem.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {
}
