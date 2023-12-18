package com.yourcompany.pollingsystem.service;

import com.yourcompany.pollingsystem.model.Poll;
import com.yourcompany.pollingsystem.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class PollService {
    @Autowired
    private PollRepository pollRepository;

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public Poll getPollById(Long id) {
        return pollRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Poll not found"));
    }

    public Poll updatePoll(Long id, Poll pollDetails) {
        Poll poll = pollRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Poll not found"));
        // Ajoutez la logique de mise à jour ici
        return pollRepository.save(poll);
    }

    public void deletePoll(Long id) {
        Poll poll = pollRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Poll not found"));
        pollRepository.delete(poll);
    }
}
