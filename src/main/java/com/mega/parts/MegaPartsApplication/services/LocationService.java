package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;

public interface LocationService {
	
		LocationEntity createLocation(LocationEntity _Location);
	
		List<LocationEntity> findAll();



		 Optional<LocationEntity> findOne(UUID id);
		 
		 boolean isExists(UUID id);
		 
		 
			
		Page<LocationEntity> findAll(Pageable pageable);

		LocationEntity partialUpdate(UUID _id, LocationEntity _location);
		void delete(UUID _id);
		LocationEntity save(LocationEntity location);
			
			

}
