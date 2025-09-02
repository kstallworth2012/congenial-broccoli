package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


import com.mega.parts.MegaPartsApplication.domain.dto.InventoryDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class InventoryMapperImpl implements Mapper<InventoryEntity, InventoryDTO> {

	
	private ModelMapper modelMapper;
	
	
	public InventoryMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public InventoryDTO mapTo(InventoryEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,InventoryDTO.class);
	}

	@Override
	public InventoryEntity mapFrom(InventoryDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,InventoryEntity.class);
	}

}
