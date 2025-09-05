package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.JobHistoryDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.JobHistoryEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class JobHistoryMapperImpl implements Mapper<JobHistoryEntity, JobHistoryDTO> {

	
	private ModelMapper modelMapper;
	
	
	public JobHistoryMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public JobHistoryDTO mapTo(JobHistoryEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,JobHistoryDTO.class);
	}

	@Override
	public JobHistoryEntity mapFrom(JobHistoryDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,JobHistoryEntity.class);
	}

}
