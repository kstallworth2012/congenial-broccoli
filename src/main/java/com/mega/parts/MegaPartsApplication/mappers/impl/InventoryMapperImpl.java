package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.InventoryDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class InventoryMapperImpl implements Mapper<InventoryEntity, InventoryDTO> {

	@Override
	public InventoryDTO mapTo(InventoryEntity a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryEntity mapFrom(InventoryDTO b) {
		// TODO Auto-generated method stub
		return null;
	}

}
