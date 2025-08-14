package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.JobHistoryEntity;

public interface JobHistoryService {
		
		JobHistoryEntity createJobHistory(JobHistoryEntity _JobHistory);
	
		List<JobHistoryEntity> findAll();



		 Optional<JobHistoryEntity> findOne(String id);
		 
		 boolean isExists(String id);
}
