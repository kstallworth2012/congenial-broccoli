package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.ProductDescriptionEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDescriptionRepository extends CrudRepository<ProductDescriptionEntity, UUID>,
PagingAndSortingRepository<ProductDescriptionEntity,UUID>{
}