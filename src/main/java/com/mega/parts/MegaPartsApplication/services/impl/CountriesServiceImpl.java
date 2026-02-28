package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;
import com.mega.parts.MegaPartsApplication.repositories.CountriesRepository;
import com.mega.parts.MegaPartsApplication.services.CountriesService;

@Service
public class CountriesServiceImpl implements CountriesService {

	
	private CountriesRepository countriesRepository;
	
	
	
	public CountriesServiceImpl(CountriesRepository _countriesRepository) {
		this.countriesRepository = _countriesRepository;
	}

	@Override
	public CountriesEntity createCountry(CountriesEntity _country) {
		// TODO Auto-generated method stub
		return countriesRepository.save(_country);
	}

	@Override
	public List<CountriesEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(countriesRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<CountriesEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return countriesRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return countriesRepository.existsById(id);
	}

	@Override
	public Page<CountriesEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CountriesEntity partialUpdate(UUID _id, CountriesEntity _country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CountriesEntity save(CountriesEntity countriesEntity) {
		// TODO Auto-generated method stub
		return null;
	}}