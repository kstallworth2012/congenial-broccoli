package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;

public interface JobsService {
	
	
	JobsEntity createJob(JobsEntity _Jobs);
	
	List<JobsEntity> findAll();

	Optional<JobsEntity> findOne(UUID id);
		 
	boolean isExists(UUID id);
	
	Page<JobsEntity> findAll(Pageable pageable);
	
    JobsEntity partialUpdate(UUID _id, JobsEntity _jobs);
	
    void delete(UUID _id);
	JobsEntity save(JobsEntity _jobsEntity);
	


}
