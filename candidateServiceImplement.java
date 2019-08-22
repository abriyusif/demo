package com.example.demo.candidature.candidates.service;

import com.example.demo.candidature.candidates.model.Candidate;
import com.example.demo.candidature.candidates.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class candidateServiceImplement implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public void addCandidate(Candidate candidate) {
        candidateRepository.save(candidate);

    }

    @Override
    public Optional<Candidate> getCandidate(Long id) {
        Optional<Candidate> candidate = candidateRepository.findById(id);

        return candidate;
    }

    @Override
    public List<Candidate> getAllCandidates() {
        List <Candidate> candidates = new ArrayList<>();
        candidateRepository.findAll().forEach(candidates::add);
        return candidates;
    }

    @Override
    public void removeCandidate(Long id) {
        candidateRepository.deleteById(id);

    }

    @Override
    public void updateCandidate(Candidate candidate, Long id) {
        candidateRepository.save(candidate);

    }
}
