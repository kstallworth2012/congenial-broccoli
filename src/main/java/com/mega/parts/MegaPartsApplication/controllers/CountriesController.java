package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mega.parts.MegaPartsApplication.domain.entities.CountriesEntity;
import com.mega.parts.MegaPartsApplication.repositories.CountriesRepository;

@RestController
@RequestMapping("/api/countries")
public class CountriesController{



		private final CountriesRepository countriesRepository;

    public CountriesController(CountriesRepository _countriesRepository) {
        this.countriesRepository = _countriesRepository;
    }


    // Read All
    @GetMapping
    public Iterable<CountriesEntity> getAllCountries() {
        return countriesRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<CountriesEntity> getCountriesRepositoryById(@PathVariable Long id) {
        return countriesRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}