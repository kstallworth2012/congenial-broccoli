package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CountriesRepository extends CrudRepository<CountriesEntity, UUID>,
PagingAndSortingRepository<CountriesEntity, UUID>{
}