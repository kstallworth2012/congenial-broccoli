package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Optional<InventoryEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return inventoryRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return inventoryRepository.existsById(id);
	}

	@Override
	public Page<InventoryEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryEntity partialUpdate(UUID _id, InventoryEntity _inventory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InventoryEntity save(InventoryEntity inventoryEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
