package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

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
		return null;
	}

	@Override
	public List<RegionsEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<RegionsEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
