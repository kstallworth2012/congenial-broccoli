package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;
import com.mega.parts.MegaPartsApplication.repositories.WarehouseRepository;
import com.mega.parts.MegaPartsApplication.services.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	
	private WarehouseRepository warehouseRepository;
	
		
	
	public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
		this.warehouseRepository = warehouseRepository;
	}

	@Override
	public WarehouseEntity createWarehouse(WarehouseEntity _warehouse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WarehouseEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(warehouseRepository.findAll().spliterator(),false).collect(Collectors.toList());
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
