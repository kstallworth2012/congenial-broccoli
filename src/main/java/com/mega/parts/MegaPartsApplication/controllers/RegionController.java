package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mega.parts.MegaPartsApplication.domain.entities.Entity;
import com.mega.parts.MegaPartsApplication.repositories.Repository;

@RestController
@RequestMapping("/api/regions")
public class RegionController{


		private final InventoryInventoryRepository inventoryRepository;

    public Controller(InventoryRepository _inventoryRepository) {
        this.inventoryRepository = _inventoryRepository;
    }


    // Read All
    @GetMapping
    public Iterable<InventoryEntity> getAllInventory() {
        return inventoryRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<InventoryEntity> getInventoryById(@PathVariable Long id) {
        return inventoryRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}