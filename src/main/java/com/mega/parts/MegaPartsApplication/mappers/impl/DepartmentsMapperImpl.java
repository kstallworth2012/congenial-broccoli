package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.DepartmentsDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;



@Component
public class DepartmentsMapperImpl implements Mapper<DepartmentsEntity, DepartmentsDTO> {

	@Override
	public DepartmentsDTO mapTo(DepartmentsEntity a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentsEntity mapFrom(DepartmentsDTO b) {
		// TODO Auto-generated method stub
		return null;
	}

}
