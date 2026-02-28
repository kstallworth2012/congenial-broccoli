package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderEntity;
import com.mega.parts.MegaPartsApplication.repositories.OrderRepository;
import com.mega.parts.MegaPartsApplication.services.OrderService;




@Service
public class OrderServiceImpl implements OrderService {

	
	
	private OrderRepository orderRepository;
	
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public OrderEntity createOrder(OrderEntity _order) {
		// TODO Auto-generated method stub
		return orderRepository.save(_order);
	}

	@Override
	public List<OrderEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(orderRepository.findAll().spliterator(),false).collect(Collectors.toList());	}


	@Override
	public Optional<OrderEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Page<OrderEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderEntity partialUpdate(UUID _id, OrderEntity _order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderEntity save(OrderEntity _order) {
		// TODO Auto-generated method stub
		return null;
	}

}
