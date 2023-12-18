package com.yourcompany.pollingsystem.controller;

import com.yourcompany.pollingsystem.model.Vote;
import com.yourcompany.pollingsystem.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @PostMapping
    public ResponseEntity<Vote> createVote(@RequestBody Vote vote) {
        Vote newVote = voteService.castVote(vote);
        return new ResponseEntity<>(newVote, HttpStatus.CREATED);
    }

    @GetMapping("/poll/{pollId}")
    public ResponseEntity<List<Vote>> getVotesByPollId(@PathVariable Long pollId) {
        List<Vote> votes = voteService.getVotesByPollId(pollId);
        return new ResponseEntity<>(votes, HttpStatus.OK);
    }
}

