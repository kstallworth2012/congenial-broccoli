package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.OrderItemEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID>,
PagingAndSortingRepository<OrderItemEntity, UUID>{
}