package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.ProductInformationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductInformationRepository extends CrudRepository<ProductInformationEntity, Long> {
}