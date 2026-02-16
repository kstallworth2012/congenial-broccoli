package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
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
    
    
    
 
   	 //PAGEABLE
	@GetMapping(path="/")
	public Page<JobDTO> listJobs(Pageable page){
		Page<JobsEntity> jobs = jobsService.findAll(page);
		return jobs.map(jobsMapper::mapTo);
	}
	 /*
	
	
		 @GetMapping(path = "/{job_id}")
	     public ResponseEntity<JobDTO> getActivity(@PathVariable("activity_id") Long id){
	    	 Optional<ActivitiesEntity> foundActivity = activitiesService.findOne(id);
	    	 return foundActivity.map(ActivitiesEntity ->{
	    		 ActivitiesDTO activitiesDTO = activitiesMapper.mapTo(ActivitiesEntity);
	    		 return new ResponseEntity<>(activitiesDTO, HttpStatus.OK);
	    	 
	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	     }
	
	
	
	
	
	/*

    	     @PostMapping(path = "/new-activity")
	     public ResponseEntity<ActivitiesDTO> createActivity(@RequestBody ActivitiesDTO _activitiesDTO){
	          
	     			ActivitiesEntity activityEntity = activitiesMapper.mapFrom(_activitiesDTO);
	     	     	ActivitiesEntity savedActivityEntity = activitiesService.createActivity(activityEntity);
	     	     	return new ResponseEntity<>(activitiesMapper.mapTo(savedActivityEntity), HttpStatus.CREATED);
	     }
    
    */
	
	
	
	
	
   */

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