package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.JobHistoryEntity;
import com.mega.parts.MegaPartsApplication.repositories.JobHistoryRepository;


@RestController
@RequestMapping("/api/job-histories")
public class JobHistoryController{



	private final JobHistoryRepository jobHistoryRepository;

    public JobHistoryController(JobHistoryRepository _jobHistoryRepository) {
        this.jobHistoryRepository = _jobHistoryRepository;
    }


    // Read All
    @GetMapping
    public Iterable<JobHistoryEntity> getAllJobHistories() {
        return JobHistoryRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<JobHistoryEntity> getJobHistoryById(@PathVariable Long id) {
        return JobHistoryRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}