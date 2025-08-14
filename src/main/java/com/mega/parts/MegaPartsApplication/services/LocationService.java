package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;

public interface LocationService {
	
		LocationEntity createLocation(LocationEntity _Location);
	
		List<LocationEntity> findAll();



		 Optional<LocationEntity> findOne(String id);
		 
		 boolean isExists(String id);

}
