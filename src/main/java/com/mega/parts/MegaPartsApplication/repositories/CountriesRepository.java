package com.mega.parts.MegaPartsApplication.repositories;





import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;
import org.springframework.data.repository.CrudRepository;

public interface CountriesRepository extends CrudRepository<CountriesEntity, Long> {
}