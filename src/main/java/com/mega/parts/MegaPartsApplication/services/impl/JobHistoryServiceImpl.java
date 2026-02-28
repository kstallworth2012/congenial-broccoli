package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		return jobHistoryRepository.save(_JobHistory);
	}

	@Override
	public List<JobHistoryEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(jobHistoryRepository.findAll().spliterator(),false).collect(Collectors.toList());

	}

	@Override
	public Optional<JobHistoryEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return jobHistoryRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return jobHistoryRepository.existsById(id);
	}

	@Override
	public Page<JobHistoryEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobHistoryEntity partialUpdate(UUID _id, JobHistoryEntity _jobHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JobHistoryEntity save(JobHistoryEntity jobHistoryEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
