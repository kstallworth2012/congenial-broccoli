package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.workflow.workmanagementapp.domain.dto.ActivitiesDTO;
import com.example.workflow.workmanagementapp.domain.entities.ActivitiesEntity;
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
    @GetMapping(path="/")
    public List<CountriesDTO> getAllCountries() {
    	List<CountriesEntity> countries = countriesService.findAll();
        return countries.stream().map(countriesMapper::mapTo).collect(Collectors.toList());
    }
    
    
    
    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<CountriesDTO> listActivities(Pageable page){
   		Page<CountriesEntity> countries = countriesService.findAll(page);
   		return countries.map(countriesMapper::mapTo);
   	}
   	  

   		 // Read One
   	     @GetMapping(path = "/{country_id}")
   	     public ResponseEntity<CountriesDTO> getCountry(@PathVariable("country_id") Long id){
   	    	 Optional<CountriesEntity> foundCountry = countriesService.findOne(id);
   	    	 return foundCountry.map(CountriesEntity ->{
   	    		 CountriesDTO countryDTO = countriesMapper.mapTo(CountriesEntity);
   	    		 return new ResponseEntity<>(countryDTO, HttpStatus.OK);
   	    	 
   	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   	     }

   


    	 @PostMapping(path = "/new-country")
	     public ResponseEntity<CountriesDTO> createCountry(@RequestBody CountriesDTO _countriesDTO){
	          
	     			CountriesEntity countryEntity = countriesMapper.mapFrom(_countriesDTO);
	     	     	CountriesEntity savedCountryEntity = countriesService.createCountry(countryEntity);
	     	     	return new ResponseEntity<>(countriesMapper.mapTo(savedCountryEntity), HttpStatus.CREATED);
	     }
  
    
    
    
    
   
    @DeleteMapping(path="/{id}")
	public ResponseEntity<CountriesDTO> deleteApplicant(@PathVariable("id") String id) {
		
		countriesService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    

}