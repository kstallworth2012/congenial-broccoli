package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.RegionsEntity;
import com.mega.parts.MegaPartsApplication.repositories.RegionsRepository;

@RestController
@RequestMapping("/api/regions")
public class RegionController{


		private final RegionsRepository regionRepository;

    public RegionController(RegionsRepository _regionRepository) {
        this.regionRepository = _regionRepository;
    }


    // Read All
    @GetMapping
    public Iterable<RegionsEntity> getAllRegions() {
        return regionRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<RegionsEntity> getRegionRepositoryById(@PathVariable Long id) {
        return regionRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}