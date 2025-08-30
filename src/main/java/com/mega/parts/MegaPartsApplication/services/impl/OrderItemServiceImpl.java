package com.mega.parts.MegaPartsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;
import com.mega.parts.MegaPartsApplication.services.OrderItemService;


@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Override
	public OrderItemEntity createOrderItem(OrderItemEntity _orderItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItemEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<OrderItemEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
