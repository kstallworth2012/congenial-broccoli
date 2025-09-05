package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.RegionsDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.RegionsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class RegionsMapperImpl implements Mapper<RegionsDTO, RegionsDTO> {

	
	private ModelMapper modelMapper;
	
	
	
	public RegionsMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public RegionsDTO mapTo(RegionsEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,RegionsDTO.class);
	}

	@Override
	public RegionsDTO mapFrom(RegionsDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,RegionsEntity.class);
	}

}
