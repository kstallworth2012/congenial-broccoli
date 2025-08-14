package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;

public interface JobsService {
	
	
	JobsEntity createJob(JobsEntity _Jobs);
	
	List<JobsEntity> findAll();

	Optional<JobsEntity> findOne(String id);
		 
	boolean isExists(String id);


}
