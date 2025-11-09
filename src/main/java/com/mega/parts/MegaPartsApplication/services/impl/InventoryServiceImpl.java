package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;
import com.mega.parts.MegaPartsApplication.repositories.InventoryRepository;
import com.mega.parts.MegaPartsApplication.services.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {

	
	
	private InventoryRepository inventoryRepository;
	
	
	
	public InventoryServiceImpl(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}

	@Override
	public InventoryEntity createInventory(InventoryEntity _inventory) {
		// TODO Auto-generated method stub
		return inventoryRepository.save(_inventory);
	}

	@Override
	public List<InventoryEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(inventoryRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<InventoryEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return inventoryRepository.findById(id);
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return inventoryRepository.existsById(id);
	}

}
