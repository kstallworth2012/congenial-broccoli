package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
		return warehouseRepository.save(_warehouse);
	}

	@Override
	public List<WarehouseEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(warehouseRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<WarehouseEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return warehouseRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return warehouseRepository.existsById(id);
	}

	@Override
	public Page<WarehouseEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarehouseEntity partialUpdate(UUID _id, WarehouseEntity _warehouse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WarehouseEntity save(WarehouseEntity warehouse) {
		// TODO Auto-generated method stub
		return null;
	}

}
