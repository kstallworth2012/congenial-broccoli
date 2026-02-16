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

    
    /*
 	 @GetMapping(path = "/")
public List<ActivitiesDTO> listActivities(){
	 List<ActivitiesEntity> activities = activitiesService.findAll();
	 return activities.stream().map(activitiesMapper::mapTo).collect(Collectors.toList());
			 }
*/


//    // Read All
//    @GetMapping(path="/")
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