package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;

import com.example.workflow.workmanagementapp.domain.dto.ActivitiesDTO;
import com.example.workflow.workmanagementapp.domain.entities.ActivitiesEntity;
import com.mega.parts.MegaPartsApplication.domain.dto.JobDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.JobRepository;
import com.mega.parts.MegaPartsApplication.services.JobsService;


@RestController
@RequestMapping("/api/jobs")
public class JobsController{

		private final JobsService jobsService;
		private Mapper<JobsEntity, JobDTO> jobsMapper;

    public JobsController(JobsService _jobsService,Mapper<JobsEntity, JobDTO> _jobsMapper) {
        this.jobsService = _jobsService;
        this.jobsMapper = _jobsMapper;
    }

    
    
  
    // Read All
    @GetMapping(path="/")
    public List<JobDTO> getAllJobs() {
    	
    	List<JobsEntity> jobs = jobsService.findAll();
        return jobs.stream().map(jobsMapper::mapTo).collect(Collectors.toList());
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