package com.yourcompany.pollingsystem.service;

import com.yourcompany.pollingsystem.model.Vote;
import com.yourcompany.pollingsystem.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public Vote castVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public List<Vote> getVotesByPollId(Long pollId) {
        return voteRepository.findByPollId(pollId);
    }
}

