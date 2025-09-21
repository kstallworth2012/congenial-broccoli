package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.RegionsEntity;

public interface RegionsService {
	
	RegionsEntity createRegions(RegionsEntity _regions);
	
	List<RegionsEntity> findAll();
	

	Optional<RegionsEntity> findOne(Long id);
		 
	boolean isExists(Long id);

}
