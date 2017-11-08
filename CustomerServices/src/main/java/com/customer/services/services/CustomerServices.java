package com.customer.services.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.customer.services.domain.Customer;
import com.customer.services.jpa.repository.CustomerRepository;


@Service
public class CustomerServices {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerServices.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServices(){	}
	
	public  Customer  createCustomer(Customer customer){
		return customerRepository.save(customer);
	}
	
	public  void  updateCustmer(Customer customer){
		customerRepository.save(customer);
	}
	
	public  void   deleteCustmer(Customer customer){
		customerRepository.delete(customer);
	}
	
	public  Iterable<Customer> getAllCustomer(){
		Iterable<Customer> pageOfCustomer = customerRepository.findAll();
		return pageOfCustomer;
	}

	
}
