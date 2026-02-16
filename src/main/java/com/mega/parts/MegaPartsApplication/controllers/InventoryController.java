package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.mega.parts.MegaPartsApplication.domain.dto.InventoryDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.InventoryRepository;
import com.mega.parts.MegaPartsApplication.services.InventoryService;


@RestController
@RequestMapping("/api/inventory")
public class InventoryController{

	private final InventoryService inventoryService;
	private Mapper<InventoryEntity, InventoryDTO> inventoryMapper;

    public InventoryController(InventoryService _inventoryService,Mapper<InventoryEntity, InventoryDTO> _inventoryMapper) {
        this.inventoryService = _inventoryService;
        this.inventoryMapper = _inventoryMapper;
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
    
    
    
    /*
    
    	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    */
    

}