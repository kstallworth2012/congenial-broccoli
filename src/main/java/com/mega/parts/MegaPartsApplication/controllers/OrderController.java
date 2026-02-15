package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import com.mega.parts.MegaPartsApplication.domain.dto.OrderDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.OrderRepository;

@RestController
@RequestMapping("/api/orders")
public class OrderController{


	private final OrderRepository orderRepository;
	private Mapper<OrderEntity, OrderDTO> orderMapper;

    public OrderController(OrderRepository _orderRepository,Mapper<OrderEntity, OrderDTO> _orderMapper) {
        this.orderRepository = _orderRepository;
        this.orderMapper = _orderMapper;
    }


//    // Read All
//    @GetMapping
//    public Iterable<OrderEntity> getAllOrders() {
//        return OrderRepository.findAll();
//    }
//
//    // Read One
//    @GetMapping("/{id}")
//    public ResponseEntity<OrderEntity> getOrderById(@PathVariable Long id) {
//        return OrderRepository.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//    
    
    
    /*
    
    	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    */
    
}