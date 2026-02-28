package com.mega.parts.MegaPartsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderEntity;

public interface OrderService {
	
	OrderEntity createOrder(OrderEntity _order);
	
	List<OrderEntity> findAll();



	Optional<OrderEntity> findOne(UUID id);
		 
	boolean isExists(UUID id);

	
	Page<OrderEntity> findAll(Pageable pageable);

    OrderEntity partialUpdate(UUID _id, OrderEntity _order);
	void delete(UUID _id);
	OrderEntity save(OrderEntity _order);
	

}
