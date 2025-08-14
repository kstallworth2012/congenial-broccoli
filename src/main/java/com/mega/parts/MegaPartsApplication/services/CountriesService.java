package com.mega.parts.MegaPartsApplication.services;

import java.util.List;

import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;

public interface CountriesService {

	
	CountriesEntity createCountry(CountriesEntity _country);
	
	List<CountriesEntity> findAll();
}
