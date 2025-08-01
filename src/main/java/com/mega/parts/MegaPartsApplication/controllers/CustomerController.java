package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;
import com.mega.parts.MegaPartsApplication.repositories.CustomerRepository;


@RestController
@RequestMapping("/api/customers")
public class CustomerController{

	private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository _customerRepository) {
        this.customerRepository = _customerRepository;
    }


    // Read All
    @GetMapping
    public Iterable<CustomerEntity> getAllCustomers() {
        return CustomerRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<CustomerEntity> getCustomerRepositoryById(@PathVariable Long id) {
        return CustomerRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



}