package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;

public interface WarehouseService {

	
	WarehouseEntity createWarehouse(WarehouseEntity _warehouse);
	
	List<WarehouseEntity> findAll();
	

	Optional<WarehouseEntity> findOne(String id);
		 
	boolean isExists(String id);
}
