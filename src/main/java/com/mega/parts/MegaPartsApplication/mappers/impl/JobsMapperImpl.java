package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.JobDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class JobsMapperImpl implements Mapper<JobsEntity, JobDTO> {

	@Override
	public JobDTO mapTo(JobsEntity a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobsEntity mapFrom(JobDTO b) {
		// TODO Auto-generated method stub
		return null;
	}

}
