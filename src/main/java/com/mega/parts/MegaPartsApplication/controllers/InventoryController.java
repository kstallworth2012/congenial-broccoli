package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
   	  
 /*

   	     @GetMapping(path = "/{activity_id}")
   	     public ResponseEntity<ActivitiesDTO> getActivity(@PathVariable("activity_id") Long id){
   	    	 Optional<ActivitiesEntity> foundActivity = activitiesService.findOne(id);
   	    	 return foundActivity.map(ActivitiesEntity ->{
   	    		 ActivitiesDTO activitiesDTO = activitiesMapper.mapTo(ActivitiesEntity);
   	    		 return new ResponseEntity<>(activitiesDTO, HttpStatus.OK);
   	    	 
   	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   	     }

   */

    
   	/*

    @PostMapping(path = "/new-activity")
public ResponseEntity<ActivitiesDTO> createActivity(@RequestBody ActivitiesDTO _activitiesDTO){
     
			ActivitiesEntity activityEntity = activitiesMapper.mapFrom(_activitiesDTO);
	     	ActivitiesEntity savedActivityEntity = activitiesService.createActivity(activityEntity);
	     	return new ResponseEntity<>(activitiesMapper.mapTo(savedActivityEntity), HttpStatus.CREATED);
}

*/
    
    
    
    
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