package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.JobDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.JobRepository;


@RestController
@RequestMapping("/api/jobs")
public class JobsController{

		private final JobRepository jobsRepository;
		private Mapper<JobsEntity, JobDTO> jobsMapper;

    public JobsController(JobRepository _jobsRepository,Mapper<JobsEntity, JobDTO> _jobsMapper) {
        this.jobsRepository = _jobsRepository;
        this.jobsMapper = _jobsMapper;
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
    
    
    
    /*
    
    	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    */
    
}