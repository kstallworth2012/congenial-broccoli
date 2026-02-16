package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mega.parts.MegaPartsApplication.domain.dto.CustomerDTO;
import com.mega.parts.MegaPartsApplication.domain.entities.CustomerEntity;
import com.mega.parts.MegaPartsApplication.mappers.Mapper;
import com.mega.parts.MegaPartsApplication.repositories.CustomerRepository;
import com.mega.parts.MegaPartsApplication.services.CustomerService;


@RestController
@RequestMapping("/api/customers")
public class CustomerController{

	private CustomerService customerService;
	private Mapper<CustomerEntity, CustomerDTO> customerMapper;

    public CustomerController(CustomerService _customerService,Mapper<CustomerEntity, CustomerDto> _customerMapper) {
        this.customerService = _customerService;
        this.customerMapper = _customerMapper;
    }


    // Read All
    @GetMapping(path="/")
    public List<CustomerDTO> getAllCustomers() {
    	List<CustomerEntity> customers = customerService.findAll();
        return customers.stream().map(customerMapper::mapTo).collect(Collectors.toList());
    }

    
  
    //PAGEABLE
   	@GetMapping(path="/")
   	public Page<CustomerDTO> listCustomers(Pageable page){
   		Page<CustomerEntity> customers = customerService.findAll(page);
   		return customers.map(customerMapper::mapTo);
   	}
   	  

   	// Read One
   	 @GetMapping(path = "/{customer_id}")
   	 public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customer_id") Long id){
   	    	 Optional<CustomerEntity> foundCustomer = customerService.findOne(id);
   	    	 return foundCustomer.map(CustomerEntity ->{
   	    		 CustomerDTO customerDTO = customerMapper.mapTo(CustomerEntity);
   	    		 return new ResponseEntity<>(customerDTO, HttpStatus.OK);
   	    	 
   	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
   	     }

   

    
    
    


    
    
    
    @DeleteMapping(path="/{id}")
	public ResponseEntity<CustomerDTO> deleteCustomer(@PathVariable("id") String id) {
		
		customerService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
    
    
    
    
    

}