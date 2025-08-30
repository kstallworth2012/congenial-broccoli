package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.springframework.stereotype.Component;

import com.mega.parts.MegaPartsApplication.domain.dto.OrderDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

@Component
public class OrderMapperImpl implements Mapper<OrderEntity, OrderDTO> {

	@Override
	public OrderDTO mapTo(OrderEntity a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderEntity mapFrom(OrderDTO b) {
		// TODO Auto-generated method stub
		return null;
	}

}
