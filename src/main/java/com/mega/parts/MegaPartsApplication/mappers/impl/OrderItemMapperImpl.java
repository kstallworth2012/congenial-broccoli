package com.mega.parts.MegaPartsApplication.mappers.impl;

import org.modelmapper.ModelMapper;

import com.mega.parts.MegaPartsApplication.domain.dto.OrderItemDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;

public class OrderItemMapperImpl implements Mapper<OrderItemEntity, OrderItemDTO> {

	
	private ModelMapper modelMapper;
	
	
	
	public OrderItemMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public OrderItemDTO mapTo(OrderItemEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a,OrderItemDTO.class);
	}

	@Override
	public OrderItemEntity mapFrom(OrderItemDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,OrderItemEntity.class);
	}

}
