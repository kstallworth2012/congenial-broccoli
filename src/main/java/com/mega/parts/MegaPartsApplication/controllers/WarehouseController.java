package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.WarehouseDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.WarehouseRepository;

@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController{


   private final WarehouseRepository warehouseRepository;
    private Mapper<WarehouseEntity, WarehouseDTO> warehouseMapper;

    public WarehouseController(WarehouseRepository _warehouseRepository,Mapper<WarehouseEntity, WarehouseDTO> _warehouseMapper) {
        this.warehouseRepository = _warehouseRepository;
        this.warehouseMapper = _warehouseMapper;
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    
    	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    */
    
    
}