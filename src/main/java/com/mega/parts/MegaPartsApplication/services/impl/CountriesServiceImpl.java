package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
	public Optional<CountriesEntity> findOne(Long id) {
		// TODO Auto-generated method stub
		return countriesRepository.findById(id);
	}

	@Override
	public boolean isExists(Long id) {
		// TODO Auto-generated method stub
		return countriesRepository.existsById(id);
	}}