package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;
import com.mega.parts.MegaPartsApplication.services.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	@Override
	public WarehouseEntity createWarehouse(WarehouseEntity _warehouse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WarehouseEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<WarehouseEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
