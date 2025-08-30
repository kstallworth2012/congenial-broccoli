package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;
import com.mega.parts.MegaPartsApplication.services.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Override
	public InventoryEntity createInventory(InventoryEntity _inventory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InventoryEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<InventoryEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
