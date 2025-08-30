package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;
import com.mega.parts.MegaPartsApplication.services.CountriesService;

@Service
public class CountriesServiceImpl implements CountriesService {

	@Override
	public CountriesEntity createCountry(CountriesEntity _country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CountriesEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CountriesEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}}