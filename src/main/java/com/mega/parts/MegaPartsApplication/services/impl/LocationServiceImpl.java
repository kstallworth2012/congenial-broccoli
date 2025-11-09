package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
	public Optional<LocationEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return locationRepository.findById(id);
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return locationRepository.existsById(id);
	}

}
