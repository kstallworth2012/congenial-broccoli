package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;
import com.mega.parts.MegaPartsApplication.repositories.LocationRepository;


@RestController
@RequestMapping("/api/locations")
public class LocationController{

  		private final LocationRepository locationRepository;

    public LocationController(LocationRepository _locationRepository) {
        this.locationRepository = _locationRepository;
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



}