package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;

public interface CountriesService {

	
	CountriesEntity createCountry(CountriesEntity _country);
	
	List<CountriesEntity> findAll();
	
	Optional<CountriesEntity> findOne(UUID id);
	 
	boolean isExists(UUID id);
	
	
	Page<CountriesEntity> findAll(Pageable pageable);

    CountriesEntity partialUpdate(UUID _id, CountriesEntity _country);
	void delete(UUID _id);
	CountriesEntity save(CountriesEntity countriesEntity);
	
	
}
