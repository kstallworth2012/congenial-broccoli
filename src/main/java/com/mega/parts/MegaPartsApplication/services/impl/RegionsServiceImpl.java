package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.RegionsEntity;
import com.mega.parts.MegaPartsApplication.repositories.RegionsRepository;
import com.mega.parts.MegaPartsApplication.services.RegionsService;

@Service
public class RegionsServiceImpl implements RegionsService {

	
	
	private RegionsRepository regionsRepository;
	
	
	
	
	public RegionsServiceImpl(RegionsRepository regionsRepository) {
		this.regionsRepository = regionsRepository;
	}

	@Override
	public RegionsEntity createRegions(RegionsEntity _regions) {
		// TODO Auto-generated method stub
		return regionsRepository.save(_regions);
	}

	@Override
	public List<RegionsEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(regionsRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<RegionsEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return regionsRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return regionsRepository.existsById(id);
	}

	@Override
	public Page<RegionsEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegionsEntity partialUpdate(UUID _id, RegionsEntity _Regions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegionsEntity save(RegionsEntity Entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
