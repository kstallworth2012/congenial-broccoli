package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.JobHistoryEntity;
import com.mega.parts.MegaPartsApplication.repositories.JobHistoryRepository;
import com.mega.parts.MegaPartsApplication.services.JobHistoryService;

@Service
public class JobHistoryServiceImpl implements JobHistoryService {

	
	private JobHistoryRepository jobHistoryRepository;
	
	
	
	public JobHistoryServiceImpl(JobHistoryRepository jobHistoryRepository) {
		this.jobHistoryRepository = jobHistoryRepository;
	}

	@Override
	public JobHistoryEntity createJobHistory(JobHistoryEntity _JobHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobHistoryEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<JobHistoryEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
