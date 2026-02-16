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

import com.mega.parts.MegaPartsApplication.domain.dto.DepartmentsDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.DepartmentsEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.DepartmentsRepository;
import com.mega.parts.MegaPartsApplication.services.DepartmentsService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController{


	private final DepartmentsService departmentService;
	private Mapper<DepartmentsEntity, DepartmentsDTO> departmentMapper;

    public DepartmentsController( DepartmentsService _departmentService, Mapper<DepartmentsEntity, DepartmentsDTO> _departmentMapper) {
        this.departmentService =  _departmentService;
        this.departmentMapper = _departmentMapper;
    }


    // Read All
    @GetMapping(path="/")
    public List<DepartmentsDTO> getAllDepartments() {
        List<DepartmentsEntity> departments = departmentService.findAll();
    	return departments.stream().map(departmentMapper::mapTo).collect(Collectors.toList());
    }
    

    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<DepartmentsDTO> listDepartments(Pageable page){
   		Page<DepartmentsEntity> departments = departmentService.findAll(page);
   		return departments.map(departmentMapper::mapTo);
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
    public ResponseEntity<DepartmentsEntity> getDepartmentById(@PathVariable Long id) {
        return departmentsRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    
    /*

    @PostMapping(path = "/new-activity")
public ResponseEntity<ActivitiesDTO> createActivity(@RequestBody ActivitiesDTO _activitiesDTO){
     
			ActivitiesEntity activityEntity = activitiesMapper.mapFrom(_activitiesDTO);
	     	ActivitiesEntity savedActivityEntity = activitiesService.createActivity(activityEntity);
	     	return new ResponseEntity<>(activitiesMapper.mapTo(savedActivityEntity), HttpStatus.CREATED);
}

*/
    
    /*
    
    	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    */
    

}