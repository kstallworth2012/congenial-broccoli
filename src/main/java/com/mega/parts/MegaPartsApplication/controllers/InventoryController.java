package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping(path="/")
    public List<InventoryDTO> getAllInventory() {
    	List<InventoryEntity> inventories = inventoryService.findAll();
    	return inventories.stream().map(inventoryMapper::mapTo).collect(Collectors.toList());
    }

    
    
    
    
   
    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<InventoryDTO> listInventories(Pageable page){
   		Page<InventoryEntity> inventories = inventoryService.findAll(page);
   		return inventories.map(inventoryMapper::mapTo);
   	}
   	  
 

   	     @GetMapping(path = "/{inventory_id}")
   	     public ResponseEntity<InventoryDTO> getInventory(@PathVariable("inventoryy_id") Long id){
   	    	 Optional<InventoryEntity> foundInventory = inventoryService.findOne(id);
   	    	 return foundInventory.map(InventoryEntity ->{
   	    		 InventoryDTO inventoryDTO = inventoryMapper.mapTo(InventoryEntity);
   	    		 return new ResponseEntity<>(inventoryDTO, HttpStatus.OK);
   	    	 
   	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   	     }

   

    
   	

    @PostMapping(path = "/new-activity")
public ResponseEntity<InventoryDTO> createInventory(@RequestBody InventoryDTO _inventoryDTO){
     
			InventoryEntity inventoryEntity = inventoryMapper.mapFrom(_inventoryDTO);
	     	InventoryEntity savedInventoryEntity = inventoryService.createInventory(inventoryEntity);
	     	return new ResponseEntity<>(inventoryMapper.mapTo(savedInventoryEntity), HttpStatus.CREATED);
}


    
    
    
    
    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<InventoryEntity> getInventoryById(@PathVariable UUID id) {
        return inventoryRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    
    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<InventoryDTO> deleteInventory(@PathVariable("id") UUID id) {
		
		inventoryService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    

}