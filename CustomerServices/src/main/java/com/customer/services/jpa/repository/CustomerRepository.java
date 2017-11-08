package com.customer.services.jpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.customer.services.domain.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

	 Page<Customer> findAll(Pageable pagable);
	
	
}
