package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.JobHistoryEntity;

public interface JobHistoryService {
		
		JobHistoryEntity createJobHistory(JobHistoryEntity _JobHistory);
	
		List<JobHistoryEntity> findAll();



		 Optional<JobHistoryEntity> findOne(UUID id);
		 
		 boolean isExists(UUID id);
		 
			
			Page<JobHistoryEntity> findAll(Pageable pageable);

		    JobHistoryEntity partialUpdate(UUID _id, JobHistoryEntity _jobHistory);
			void delete(UUID _id);
			JobHistoryEntity save(JobHistoryEntity jobHistoryEntity);
			
			
}
