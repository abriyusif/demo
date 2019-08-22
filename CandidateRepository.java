package com.example.demo.candidature.candidates.repository;

import com.example.demo.candidature.candidates.model.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long> {
}
