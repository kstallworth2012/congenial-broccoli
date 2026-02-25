package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WarehouseRepository extends CrudRepository<WarehouseEntity, UUID>,
PagingAndSortingRepository<WarehouseEntity, UUID>{
}