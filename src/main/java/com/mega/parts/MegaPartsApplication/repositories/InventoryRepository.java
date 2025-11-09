package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.InventoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<InventoryEntity, String> {
}