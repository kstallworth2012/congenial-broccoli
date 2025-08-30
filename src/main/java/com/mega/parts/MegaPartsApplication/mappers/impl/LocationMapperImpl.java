package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.LocationDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class LocationMapperImpl implements Mapper<LocationEntity, LocationDTO> {

	@Override
	public LocationDTO mapTo(LocationEntity a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationEntity mapFrom(LocationDTO b) {
		// TODO Auto-generated method stub
		return null;
	}

}
