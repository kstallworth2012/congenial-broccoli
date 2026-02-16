package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.OrderItemDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.OrderItemRepository;
import com.mega.parts.MegaPartsApplication.services.OrderItemService;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController{


	private final OrderItemService orderItemService;
	private Mapper<OrderItemEntity, OrderItemDTO> orderItemMapper;

    public OrderItemController(OrderItemService _orderItemService,Mapper<OrderItemEntity, OrderItemDTO> _orderItemMapper) {
        this.orderItemService = _orderItemService;
        this.orderItemMapper = _orderItemMapper;
    }


    // Read All
    @GetMapping(path="/")
    public List<OrderItemDTO> getAllOrderItems() {
    	List<OrderItemEntity> orderItems = orderItemService.findAll();
        return orderItems.stream().map(orderItemMapper::mapTo).collect(Collectors.toList());
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
    public ResponseEntity<OrderItemEntity> getOrderItemById(@PathVariable Long id) {
        return orderItemRepository.findById(id)
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