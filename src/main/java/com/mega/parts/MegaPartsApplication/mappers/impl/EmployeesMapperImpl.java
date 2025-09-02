package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


import com.mega.parts.MegaPartsApplication.domain.dto.EmployeesDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.EmployeesEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class EmployeesMapperImpl implements Mapper<EmployeesEntity, EmployeesDTO> {
	private ModelMapper modelMapper;

	public EmployeesMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public EmployeesDTO mapTo(EmployeesEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,EmployeesDTO.class);
	}

	@Override
	public EmployeesEntity mapFrom(EmployeesDTO b) {
		// TODO Auto-generated method stub
		return  modelMapper.map(b,EmployeesEntity.class);
	}

}
