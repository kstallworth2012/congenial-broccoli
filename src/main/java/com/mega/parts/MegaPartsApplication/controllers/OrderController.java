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

import com.example.workflow.workmanagementapp.domain.dto.ActivitiesDTO;
import com.example.workflow.workmanagementapp.domain.entities.ActivitiesEntity;
import com.mega.parts.MegaPartsApplication.domain.dto.OrderDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.OrderRepository;
import com.mega.parts.MegaPartsApplication.services.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController{


	private final OrderService orderService;
	private Mapper<OrderEntity, OrderDTO> orderMapper;

    public OrderController(OrderService _orderService,Mapper<OrderEntity, OrderDTO> _orderMapper) {
        this.orderService = _orderService;
        this.orderMapper = _orderMapper;
    }

    

 //PAGEABLE
	@GetMapping(path="/")
	public Page<OrderDTO> listOrders(Pageable page){
		Page<OrderEntity> orders = orderService.findAll(page);
		return orders.map(orderMapper::mapTo);
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


//    // Read All
    @GetMapping(path="/")
    public List<OrderDTO> getAllOrders() {
       	 List<OrderEntity> orders = orderService.findAll();
	 return orders.stream().map(orderMapper::mapTo).collect(Collectors.toList());
    }
//
//    // Read One
//    @GetMapping("/{id}")
//    public ResponseEntity<OrderEntity> getOrderById(@PathVariable Long id) {
//        return OrderRepository.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//    
    

    @PostMapping(path = "/new-order")
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO _orderDTO){
     
			OrderEntity orderEntity = orderMapper.mapFrom(_orderDTO);
	     	OrderEntity savedOrderEntity = orderService.createOrder(orderEntity);
	     	return new ResponseEntity<>(orderMapper.mapTo(savedOrderEntity), HttpStatus.CREATED);
}


    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<OrderDTO> deleteApplicant(@PathVariable("id") String id) {
		
		orderService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    
    
}