package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

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
    @GetMapping
    public Iterable<OrderItemEntity> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

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