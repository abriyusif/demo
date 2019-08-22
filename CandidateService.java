package com.example.demo.candidature.candidates.service;

import com.example.demo.candidature.candidates.model.Candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CandidateService {
    void addCandidate(Candidate candidate);
    Optional<Candidate> getCandidate(Long id);
    List<Candidate> getAllCandidates();
    void removeCandidate(Long id);
    void updateCandidate(Candidate candidate, Long id);

}
