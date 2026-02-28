package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;
import com.mega.parts.MegaPartsApplication.repositories.OrderItemRepository;
import com.mega.parts.MegaPartsApplication.services.OrderItemService;


@Service
public class OrderItemServiceImpl implements OrderItemService {

	
	
	private OrderItemRepository orderItemRepository;
	
	
	
	public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
		this.orderItemRepository = orderItemRepository;
	}

	@Override
	public OrderItemEntity createOrderItem(OrderItemEntity _orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepository.save(_orderItem);
	}

	@Override
	public List<OrderItemEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(orderItemRepository.findAll().spliterator(),false).collect(Collectors.toList());	}


	@Override
	public Optional<OrderItemEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Page<OrderItemEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItemEntity partialUpdate(UUID _id, OrderItemEntity _orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderItemEntity save(OrderItemEntity _orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

}
