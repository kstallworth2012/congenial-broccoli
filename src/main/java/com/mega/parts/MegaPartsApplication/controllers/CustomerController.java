package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mega.parts.MegaPartsApplication.domain.dto.CustomerDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.CustomerRepository;


@RestController
@RequestMapping("/api/customers")
public class CustomerController{

	private final CustomerRepository customerRepository;
	private Mapper<CustomerEntity, CustomerDTO> customerMapper;

    public CustomerController(CustomerRepository _customerRepository,Mapper<CustomerEntity, CustomerDto> _customerMapper) {
        this.customerRepository = _customerRepository;
        this.customerMapper = _customerMapper;
    }


    // Read All
    @GetMapping
    public List<CustomerEntity> getAllCustomers() {
        return CustomerRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<CustomerEntity> getCustomerRepositoryById(@PathVariable Long id) {
        return CustomerRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    
    /*
    
    	@DeleteMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> deleteApplicant(@PathVariable("id") String id) {
		
		appService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    */
    

}