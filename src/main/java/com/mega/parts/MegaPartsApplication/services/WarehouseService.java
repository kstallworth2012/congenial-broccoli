package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;

public interface WarehouseService {

	
	WarehouseEntity createWarehouse(WarehouseEntity _warehouse);
	
	List<WarehouseEntity> findAll();
	

	Optional<WarehouseEntity> findOne(UUID id);
		 
	boolean isExists(UUID id);
	

	Page<WarehouseEntity> findAll(Pageable pageable);

    WarehouseEntity partialUpdate(UUID _id, WarehouseEntity _warehouse);
	void delete(UUID _id);
	WarehouseEntity save(WarehouseEntity warehouse);
	
	
}
