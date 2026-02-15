package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.LocationDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.LocationRepository;


@RestController
@RequestMapping("/api/locations")
public class LocationController{

  		private final LocationRepository locationRepository;
  		private Mapper<LocationEntity, LocationDTO> locationMapper;

    public LocationController(LocationRepository _locationRepository,Mapper<LocationEntity, LocationDTO> _locationMapper) {
        this.locationRepository = _locationRepository;
        this.locationMapper = _locationMapper;
    }


    // Read All
    @GetMapping
    public Iterable<LocationEntity> getAllLocations() {
        return locationRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<LocationEntity> getLocationById(@PathVariable Long id) {
        return locationRepository.findById(id)
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