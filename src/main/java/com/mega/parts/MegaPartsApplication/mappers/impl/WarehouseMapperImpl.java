package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.WarehouseDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;


@Component
public class WarehouseMapperImpl implements Mapper<WarehouseEntity, WarehouseDTO> {

	private ModelMapper modelMapper;
	
	
	
	
	
	public WarehouseMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public WarehouseDTO mapTo(WarehouseEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,WarehouseDTO.class);
	}

	@Override
	public WarehouseEntity mapFrom(WarehouseDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,WarehouseEntity.class);
	}

}
