package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductInformationRepository extends CrudRepository<ProductInformationEntity,UUID>,
PagingAndSortingRepository<ProductInformationEntity,UUID>{
}