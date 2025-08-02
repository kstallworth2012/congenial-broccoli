package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mega.parts.MegaPartsApplication.domain.entities.RegionEntity;
import com.mega.parts.MegaPartsApplication.repositories.RegionRepository;

@RestController
@RequestMapping("/api/regions")
public class RegionController{


		private final RegionRepository regionRepository;

    public RegionController(RegionRepository _regionRepository) {
        this.regionRepository = _regionRepository;
    }


    // Read All
    @GetMapping
    public Iterable<InventoryEntity> getAllRegions() {
        return regionRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<regionEntity> getRegionRepositoryById(@PathVariable Long id) {
        return regionRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}