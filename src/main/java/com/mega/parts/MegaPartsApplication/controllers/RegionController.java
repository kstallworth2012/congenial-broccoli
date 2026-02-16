package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
    
    
    /*
    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<ActivitiesDTO> listActivities(Pageable page){
   		Page<ActivitiesEntity> activities = activitiesService.findAll(page);
   		return activities.map(activitiesMapper::mapTo);
   	}
   	  


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
    public ResponseEntity<RegionsEntity> getRegionRepositoryById(@PathVariable Long id) {
        return regionRepository.findById(id)
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