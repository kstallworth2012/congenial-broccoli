package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.ProductDescriptionEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductDescriptionRepository extends CrudRepository<ProductDescriptionEntity, Long> {
}