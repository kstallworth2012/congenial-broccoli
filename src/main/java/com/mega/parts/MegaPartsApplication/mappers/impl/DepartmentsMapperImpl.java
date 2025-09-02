package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


import com.mega.parts.MegaPartsApplication.domain.dto.DepartmentsDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;



@Component
public class DepartmentsMapperImpl implements Mapper<DepartmentsEntity, DepartmentsDTO> {

	
	
	private ModelMapper modelMapper;

	public DepartmentsMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public DepartmentsDTO mapTo(DepartmentsEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,DepartmentsDTO.class);
	}

	@Override
	public DepartmentsEntity mapFrom(DepartmentsDTO b) {
		// TODO Auto-generated method stub
		return  modelMapper.map(b,DepartmentsEntity.class);
		}
	}


