package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.http.ResponseEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;
import com.mega.parts.MegaPartsApplication.repositories.OrderItemRepository;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController{


	private final OrderItemRepository orderItemRepository;

    public OrderItemController(OrderItemRepository _orderItemRepository) {
        this.orderItemRepository = _orderItemRepository;
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
}