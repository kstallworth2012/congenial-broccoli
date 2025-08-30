package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderEntity;
import com.mega.parts.MegaPartsApplication.services.OrderService;




@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public OrderEntity createOrder(OrderEntity _order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<OrderEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
