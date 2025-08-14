package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderEntity;

public interface OrderService {
	
	OrderEntity createOrder(OrderEntity _order);
	
	List<OrderEntity> findAll();



	Optional<OrderEntity> findOne(String id);
		 
	boolean isExists(String id);

}
