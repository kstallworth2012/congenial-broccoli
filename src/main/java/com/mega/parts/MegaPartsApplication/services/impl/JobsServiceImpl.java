package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.repositories.JobHistoryRepository;
import com.mega.parts.MegaPartsApplication.services.JobsService;

@Service
public class JobsServiceImpl implements JobsService {

	
	private JobHistoryRepository jobsRepository;
	
	
	
	public JobsServiceImpl(JobHistoryRepository jobsRepository) {
		this.jobsRepository = jobsRepository;
	}

	@Override
	public JobsEntity createJob(JobsEntity _Jobs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobsEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<JobsEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
