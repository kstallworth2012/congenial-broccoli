package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;
import com.mega.parts.MegaPartsApplication.repositories.LocationRepository;
import com.mega.parts.MegaPartsApplication.services.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	
	private LocationRepository locationRepository;
	
	@Override
	public LocationEntity createLocation(LocationEntity _Location) {
		// TODO Auto-generated method stub
		return locationRepository.save(_Location);
	}

	@Override
	public List<LocationEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(locationRepository.findAll().spliterator(),false).collect(Collectors.toList());	}



	@Override
	public Optional<LocationEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Page<LocationEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationEntity partialUpdate(UUID _id, LocationEntity _location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocationEntity save(LocationEntity location) {
		// TODO Auto-generated method stub
		return null;
	}

}
