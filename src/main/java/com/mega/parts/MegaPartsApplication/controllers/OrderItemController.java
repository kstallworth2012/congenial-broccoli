package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.OrderItemDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.OrderItemRepository;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController{


	private final OrderItemRepository orderItemRepository;
	private Mapper<OrderItemEntity, OrderItemDTO> orderItemMapper;

    public OrderItemController(OrderItemRepository _orderItemRepository,Mapper<OrderItemEntity, OrderItemDTO> _orderItemMapper) {
        this.orderItemRepository = _orderItemRepository;
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