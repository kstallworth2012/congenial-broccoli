package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;

public interface OrderItemService {

		OrderItemEntity createOrderItem(OrderItemEntity _orderItem);
	
		List<OrderItemEntity> findAll();

		Optional<OrderItemEntity> findOne(UUID id);
		 
		boolean isExists(UUID id);
		
		
		Page<OrderItemEntity> findAll(Pageable pageable);

	    OrderItemEntity partialUpdate(UUID _id, OrderItemEntity _orderItem);
		void delete(UUID _id);
		OrderItemEntity save(OrderItemEntity _orderItem);
		
		
	
	
}
