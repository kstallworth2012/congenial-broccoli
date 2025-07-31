package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.WarehouseEntity;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseRepository extends CrudRepository<WarehouseEntity, Long> {
}