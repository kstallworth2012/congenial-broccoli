package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.RegionsDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.RegionsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.RegionsRepository;
import com.mega.parts.MegaPartsApplication.services.RegionsService;

@RestController
@RequestMapping("/api/regions")
public class RegionController{


	private final RegionsService regionService;
	private Mapper<RegionsEntity, RegionsDTO> regionMapper;

    public RegionController(RegionsService _regionService, Mapper<RegionsEntity, RegionsDTO> _regionMapper) {
        this.regionService = _regionService;
        this.regionMapper = _regionMapper;
    }


    // Read All
    @GetMapping(path="/")
    public List<RegionsDTO> getAllRegions() {
    	List<RegionsEntity> regions = regionService.findAll();
        return regions.stream().map(regionMapper::mapTo).collect(Collectors.toList());
    }
    
    
  
    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<RegionsDTO> listRegions(Pageable page){
   		Page<RegionsEntity> regions = regionService.findAll(page);
   		return regions.map(regionMapper::mapTo);
   	}
   	  
  

   	     @GetMapping(path = "/{region_id}")
   	     public ResponseEntity<RegionsDTO> getRegion(@PathVariable("region_id") Long id){
   	    	 Optional<RegionsEntity> foundRegion = regionService.findOne(id);
   	    	 return foundRegion.map(RegionEntity ->{
   	    		 RegionsDTO regionsDTO = regionMapper.mapTo(RegionEntity);
   	    		 return new ResponseEntity<>(regionsDTO, HttpStatus.OK);
   	    	 
   	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   	     }

   


    // Read One
//    @GetMapping("/{id}")
//    public ResponseEntity<RegionsEntity> getRegionRepositoryById(@PathVariable Long id) {
//        return regionRepository.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//    
//    

    @PostMapping(path = "/new-region")
    public ResponseEntity<RegionsDTO> createRegion(@RequestBody RegionsDTO _regionDTO){
     
			RegionsEntity warehouseEntity = regionMapper.mapFrom(_regionDTO);
	     	RegionsEntity savedWarehouseEntity = regionService.createRegion(warehouseEntity);
	     	return new ResponseEntity<>(regionMapper.mapTo(savedWarehouseEntity), HttpStatus.CREATED);
}


    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<RegionsDTO> deleteRegion(@PathVariable("id") String id) {
		
		regionService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    

}