package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.JobDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.JobsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class JobsMapperImpl implements Mapper<JobsEntity, JobDTO> {

	
	private ModelMapper modelMapper;
	
	
	public JobsMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public JobDTO mapTo(JobsEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,JobDTO.class);
	}

	@Override
	public JobsEntity mapFrom(JobDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,JobsEntity.class);
	}

}
