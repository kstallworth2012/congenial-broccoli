package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.repositories.JobsRepository;


@RestController
@RequestMapping("/api/jobs")
public class JobsController{

		private final JobsRepository jobsRepository;

    public JobsController(JobsRepository _jobsRepository) {
        this.JobsRepository = _jobsRepository;
    }


    // Read All
    @GetMapping
    public Iterable<JobsEntity> getAllJobs() {
        return JobsRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<JobsEntity> getJobsById(@PathVariable Long id) {
        return JobsRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}