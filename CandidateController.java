package com.example.demo.candidature.candidates.controllers;

import com.example.demo.candidature.candidates.model.Candidate;
import com.example.demo.candidature.candidates.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    public CandidateController (CandidateService candidateService){
        this.candidateService = candidateService;
    }
    @RequestMapping("/candidates/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Candidate> getCandidates(){
        return candidateService.getAllCandidates();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/candidates")
    public void addCandidate(@RequestBody Candidate candidate){
        candidateService.addCandidate(candidate);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/candidates/{id}")
    public void updateCandidate(@RequestBody Candidate candidate, @PathVariable Long id){
        candidateService.updateCandidate(candidate, id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "candidates/{id}")
    public void deleteCandidate(@PathVariable Long id){
        candidateService.removeCandidate(id);
    }

}
