package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.OrderItemDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.OrderItemRepository;
import com.mega.parts.MegaPartsApplication.services.OrderItemService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    
    
  
    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<OrderItemDTO> listOrderItems(Pageable page){
   		Page<OrderItemEntity> orderItems = orderItemService.findAll(page);
   		return orderItems.map(orderItemMapper::mapTo);
   	}
   	  
  

   	     @GetMapping(path = "/{orderItem_id}")
   	     public ResponseEntity<OrderItemDTO> getOrderItem(@PathVariable("orderItem_id") Long id){
   	    	 Optional<OrderItemEntity> foundOrderItemDTO = orderItemService.findOne(id);
   	    	 return foundOrderItemDTO.map(OrderItemEntity ->{
   	    		 OrderItemDTO orderItemDTO = orderItemMapper.mapTo(OrderItemEntity);
   	    		 return new ResponseEntity<>(orderItemDTO, HttpStatus.OK);
   	    	 
   	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   	     }

   

    
    
    
    
    
    
    
    
    
    
    

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<OrderItemEntity> getOrderItemById(@PathVariable Long id) {
        return orderItemRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
   

@PostMapping(path = "/new-orderItem")
public ResponseEntity<OrderItemDTO> createOrderItem(@RequestBody OrderItemDTO _orderItemDTO){
     
			OrderItemEntity orderItemEntity =orderItemMapper.mapFrom(_orderItemDTO);
	     	OrderItemEntity savedOrderItemEntity = orderItemService.createOrderItemEntity);
	     	return new ResponseEntity<>(orderItemMapper.mapTo(savedOrderItemEntity), HttpStatus.CREATED);
}


    
    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<OrderItemDTO> deleteOrderItem(@PathVariable("id") String id) {
		
		orderItemService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    
}