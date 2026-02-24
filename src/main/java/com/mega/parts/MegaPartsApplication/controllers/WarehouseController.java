package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
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
   	  

 // Read One
    @GetMapping(path = "/{warehouse_id}")
   	public ResponseEntity<WarehouseDTO> getWarehouseById(@PathVariable("warehouse_id") Long id){
   	    	 Optional<WarehouseEntity> foundWarehouse = warehouseService.findOne(id);
   	    	 return foundWarehouse.map(WarehouseEntity ->{
   	    		 WarehouseDTO warehouseDTO = warehouseMapper.mapTo(WarehouseEntity);
   	    		 return new ResponseEntity<>(warehouseDTO, HttpStatus.OK);
   	    	 
   	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   	     }

  
 
    
    
    
    
    

    
    
    
    
   

    @PostMapping(path = "/new-warehouse")
    public ResponseEntity<WarehouseDTO> createWarehouse(@RequestBody WarehouseDTO _warehouseDTO){
     
			WarehouseEntity warehouseEntity = warehouseMapper.mapFrom(_warehouseDTO);
	     	WarehouseEntity savedWarehouseEntity = warehouseService.createActivity(warehouseEntity);
	     	return new ResponseEntity<>(warehouseMapper.mapTo(savedWarehouseEntity), HttpStatus.CREATED);
}


    
    
    
    
    
    
    
    
    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<WarehouseDTO> deleteWarehouse(@PathVariable("id") String id) {
		
		warehouseService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    
    
}