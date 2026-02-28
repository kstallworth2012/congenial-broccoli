package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.LocationDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.LocationRepository;
import com.mega.parts.MegaPartsApplication.services.LocationService;


@RestController
@RequestMapping("/api/locations")
public class LocationController{

  		private final LocationService locationService;
  		private Mapper<LocationEntity, LocationDTO> locationMapper;

    public LocationController(LocationService _locationService,Mapper<LocationEntity, LocationDTO> _locationMapper) {
        this.locationService = _locationService;
        this.locationMapper = _locationMapper;
    }


    // Read All
    @GetMapping
    public List<LocationDTO> getAllLocations() {
    	List<LocationEntity> locations = locationService.findAll();
    	
        return locations.stream().map(locationMapper::mapTo).collect(Collectors.toList());
    }

    // Read One
//    @GetMapping("/{id}")
//    public ResponseEntity<LocationEntity> getLocationById(@PathVariable Long id) {
//        return locationRepository.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }

    
    
    

    @PostMapping(path = "/new-location")
    public ResponseEntity<LocationDTO> createLocation(@RequestBody LocationDTO _locationDTO){
     
			LocationEntity locationEntity = locationMapper.mapFrom(_locationDTO);
	     	LocationEntity savedLocationEntity = locationService.createLocation(locationEntity);
	     	return new ResponseEntity<>(locationMapper.mapTo(savedLocationEntity), HttpStatus.CREATED);
}


    
    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<LocationDTO> deleteLocation(@PathVariable("id") UUID id) {
		
		locationService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    

}