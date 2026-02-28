package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;

public interface InventoryService {

		InventoryEntity createInventory(InventoryEntity _inventory);
	
		List<InventoryEntity> findAll();



		 Optional<InventoryEntity> findOne(UUID id);
		 
		 boolean isExists(UUID id);
		 
			
		Page<InventoryEntity> findAll(Pageable pageable);

		InventoryEntity partialUpdate(UUID _id, InventoryEntity _inventory);
		void delete(UUID _id);
		InventoryEntity save(InventoryEntity inventoryEntity);
			
			
}
