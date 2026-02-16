package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.WarehouseDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.WarehouseRepository;
import com.mega.parts.MegaPartsApplication.services.WarehouseService;

@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController{


   private final WarehouseService warehouseService;
    private Mapper<WarehouseEntity, WarehouseDTO> warehouseMapper;

    public WarehouseController(WarehouseService _warehouseService,Mapper<WarehouseEntity, WarehouseDTO> _warehouseMapper) {
        this.warehouseService = _warehouseService;
        this.warehouseMapper = _warehouseMapper;
    }


    // Read All
    @GetMapping(path="/")
    public List<WarehouseDTO> getAllWarehouses() {
    	List<WarehouseEntity> warehouses = warehouseService.findAll();
        return warehouses.stream().map(warehouseMapper::mapTo).collect(Collectors.toList());
    }

    
    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<WarehouseDTO> listWarehoues(Pageable page){
   		Page<WarehouseEntity> warehouses = warehouseService.findAll(page);
   		return warehouses.map(warehouseMapper::mapTo);
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