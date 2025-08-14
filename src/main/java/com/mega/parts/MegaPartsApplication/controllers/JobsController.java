package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.repositories.JobRepository;


@RestController
@RequestMapping("/api/jobs")
public class JobsController{

		private final JobRepository jobsRepository;

    public JobsController(JobRepository _jobsRepository) {
        this.JobsRepository = _jobsRepository;
    }


    // Read All
    @GetMapping
    public Iterable<JobsEntity> getAllJobs() {
        return jobsRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<JobsEntity> getJobsById(@PathVariable Long id) {
        return jobsRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}