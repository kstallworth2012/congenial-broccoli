package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.RegionsEntity;

public interface RegionsService {
	
	RegionsEntity createRegions(RegionsEntity _regions);
	
	List<RegionsEntity> findAll();
	

	Optional<RegionsEntity> findOne(UUID id);
		 
	boolean isExists(UUID id);
	

	Page<RegionsEntity> findAll(Pageable pageable);

    RegionsEntity partialUpdate(UUID _id, RegionsEntity _Regions);
	void delete(UUID _id);
	RegionsEntity save(RegionsEntity Entity);
	
	

}
