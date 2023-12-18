package com.yourcompany.pollingsystem.repository;

import com.yourcompany.pollingsystem.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    List<Vote> findByPollId(Long pollId);
}

