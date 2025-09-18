package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.repositories.JobHistoryRepository;
import com.mega.parts.MegaPartsApplication.repositories.JobRepository;
import com.mega.parts.MegaPartsApplication.services.JobsService;

@Service
public class JobsServiceImpl implements JobsService {

	
	private JobRepository jobsRepository;
	
	
	
	public JobsServiceImpl(JobRepository jobsRepository) {
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
		return StreamSupport.stream(jobsRepository.findAll().spliterator(),false).collect(Collectors.toList());
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
