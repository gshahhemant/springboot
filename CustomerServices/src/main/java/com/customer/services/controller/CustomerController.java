package com.customer.services.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;
import com.customer.services.domain.Customer;
import com.customer.services.services.CustomerServices;


@RestController
@RequestMapping(value="/services/v1")
public class CustomerController {

	
	@Autowired
	private CustomerServices customerServices;

	

	/*public  @ResponseBody Page<Customer >getAllCustomers(@RequestParam (value="page", required=true, defaultValue="1") Integer page,
			@RequestParam (value="size", required=true, defaultValue="10") Integer size){
			   return customerServices.getAllCustomer(page, size);
	}*/
	
	@RequestMapping(value="/getAllCustomers",method = RequestMethod.GET, produces= {"application/json"} )
	public  @ResponseBody Iterable<Customer> getAllCustomers(){
			   return customerServices.getAllCustomer();
	}
	
	@RequestMapping(value="/createCustomer",method = RequestMethod.POST, consumes = "application/json",produces= "application/json")
	public   Customer  createCustomer(@RequestBody Customer customer){
		return customerServices.createCustomer(customer);
	}

	@RequestMapping(value="/deleteCustomer",method = RequestMethod.PUT ,consumes= "application/json")
	public  void deleteCustomer(@RequestBody Customer customer){

		customerServices.deleteCustmer(customer);

	}
	
	@RequestMapping(value="/updateCustomer",method = RequestMethod.PUT, consumes= "application/json")
	public   void  updateCustomer(@RequestBody Customer customer){
		customerServices.updateCustmer(customer);
	}
}
