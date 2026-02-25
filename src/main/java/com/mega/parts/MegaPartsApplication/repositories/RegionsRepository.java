package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.RegionsEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RegionsRepository extends CrudRepository<RegionsEntity, UUID>,
PagingAndSortingRepository<RegionsEntity, UUID>{
}