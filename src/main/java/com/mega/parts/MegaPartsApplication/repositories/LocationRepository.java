package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.LocationEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LocationRepository extends CrudRepository<LocationEntity, UUID>,
PagingAndSortingRepository<LocationEntity, UUID>{
}