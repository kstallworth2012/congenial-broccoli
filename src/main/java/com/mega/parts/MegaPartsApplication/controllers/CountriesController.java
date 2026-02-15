package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.mega.parts.MegaPartsApplication.domain.dto.CountriesDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.CountriesRepository;

@RestController
@RequestMapping("/api/countries")
public class CountriesController{



	private final CountriesRepository countriesRepository;
	private Mapper<CountriesEntity, CountriesDTO> countriesMapper;

    public CountriesController(CountriesRepository _countriesRepository,Mapper<CountriesEntity, CountriesDTO> _countriesMapper) {
        this.countriesRepository = _countriesRepository;
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
    
    
    
    /*
    
    	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    */
    

}