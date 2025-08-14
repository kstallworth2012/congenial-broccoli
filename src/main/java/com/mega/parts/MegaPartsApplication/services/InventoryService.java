package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;

public interface InventoryService {

		InventoryEntity createInventory(InventoryEntity _inventory);
	
		List<InventoryEntity> findAll();



		 Optional<InventoryEntity> findOne(String id);
		 
		 boolean isExists(String id);
}
