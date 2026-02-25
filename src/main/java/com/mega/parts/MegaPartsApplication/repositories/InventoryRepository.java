package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InventoryRepository extends CrudRepository<InventoryEntity, UUID>,
PagingAndSortingRepository<InventoryEntity, UUID>{
}