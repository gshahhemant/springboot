package com.customer.services;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import com.customer.services.domain.Customer;
import com.customer.services.jpa.repository.CustomerRepository;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static java.lang.System.exit;


@SpringBootApplication



public class CustomerServicesApplication {
//implements CommandLineRunner commit { 

	 @Autowired
     DataSource dataSource;
	 @Autowired
	 CustomerRepository customerRepository;
	 
	 /* added new comment new comments*/
	public static void main(String[] args) {
		SpringApplication.run(CustomerServicesApplication.class, args);
	     System.out.println("added new line for commit added");
	     
	}
	
	 
	  /*  @Override
	    public void run(String... args) throws Exception {

	      //  System.out.println("DATASOURCE = " + dataSource);

	    
	   //	 customerRepository.save(new Customer("newRow","newrowlastname"));
	   	 
		// customerRepository.save(new Customer(4l,"newRowupdated","newrowlastnameupdated"));
	    	
	   // customerRepository.delete(new Customer(4l,"fdsfdsf","dfdsfds"));
	        
	
	        	
	       System.out.println("\n1.findAll()...");
	        for (Customer customer : customerRepository.findAll()) {
	            System.out.println("got it :::"+customer);
	        }

	      //  System.out.println("Done!"+customer1);

	        exit(0);
	    }*/
	
	
}
