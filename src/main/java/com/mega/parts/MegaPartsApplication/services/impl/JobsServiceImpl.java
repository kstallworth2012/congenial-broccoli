package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		return jobsRepository.save(_Jobs);
	}

	@Override
	public List<JobsEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(jobsRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<JobsEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return jobsRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return jobsRepository.existsById(id);
	}


	@Override
	public Page<JobsEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobsEntity partialUpdate(UUID _id, JobsEntity _jobs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JobsEntity save(JobsEntity _jobsEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
