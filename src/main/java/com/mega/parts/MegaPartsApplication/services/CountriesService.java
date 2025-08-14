package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;

public interface CountriesService {

	
	CountriesEntity createCountry(CountriesEntity _country);
	
	List<CountriesEntity> findAll();
	
	 Optional<CountriesEntity> findOne(String id);
	 
	 boolean isExists(String id);
}
