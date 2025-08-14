package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;

public interface OrderItemService {

		OrderItemEntity createOrderItem(OrderItemEntity _orderItem);
	
		List<OrderItemEntity> findAll();

		Optional<OrderItemEntity> findOne(String id);
		 
		boolean isExists(String id);
	
	
}
