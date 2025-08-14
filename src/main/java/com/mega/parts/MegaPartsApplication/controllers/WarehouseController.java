package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;
import com.mega.parts.MegaPartsApplication.repositories.WarehouseRepository;

@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController{


		private final WarehouseRepository warehouseRepository;

    public WarehouseController(WarehouseRepository _warehouseRepository) {
        this.warehouseRepository = _warehouseRepository;
    }


    // Read All
    @GetMapping
    public Iterable<WarehouseEntity> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<WarehouseEntity> getWarehouseById(@PathVariable Long id) {
        return warehouseRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}