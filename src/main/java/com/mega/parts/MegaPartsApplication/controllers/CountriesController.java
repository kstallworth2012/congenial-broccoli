package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.mega.parts.MegaPartsApplication.domain.dto.CountriesDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.CountriesRepository;
import com.mega.parts.MegaPartsApplication.services.CountriesService;

@RestController
@RequestMapping("/api/countries")
public class CountriesController{



	private CountriesService countriesService;
	private Mapper<CountriesEntity, CountriesDTO> countriesMapper;

    public CountriesController(CountriesService _countriesService,Mapper<CountriesEntity, CountriesDTO> _countriesMapper) {
        this.countriesService = _countriesService;
        this.countriesMapper = _countriesMapper;
    }


    // Read All
    @GetMapping
    public Iterable<CountriesEntity> getAllCountries() {
        return countriesRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<CountriesEntity> getCountriesRepositoryById(@PathVariable Long id) {
        return countriesRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    
    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<CountriesDTO> deleteApplicant(@PathVariable("id") String id) {
		
		countriesService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    

}