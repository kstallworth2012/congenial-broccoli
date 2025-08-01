package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;
import com.mega.parts.MegaPartsApplication.repositories.InventoryRepository;


@RestController
@RequestMapping("/api/inventory")
public class InventoryController{

	private final InventoryRepository inventoryRepository;

    public InventoryController(InventoryRepository _inventoryRepository) {
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