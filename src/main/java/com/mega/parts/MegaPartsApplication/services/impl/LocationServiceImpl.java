package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;
import com.mega.parts.MegaPartsApplication.services.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Override
	public LocationEntity createLocation(LocationEntity _Location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<LocationEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
