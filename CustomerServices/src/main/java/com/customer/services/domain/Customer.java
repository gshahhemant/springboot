package com.customer.services.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="customer")

public class Customer  implements Serializable{

	private static final long serialVersionUID = 1l;
	
	 @Id
	 @SequenceGenerator(name="SEQ_GEN", sequenceName="customers_test", allocationSize=1)
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	 private Long customerid;
	
	@Column(name="FIRSTNAME" ,nullable= false)
	private String firstName;
	
	@Column(name="LASTNAME",nullable= false)
	private String lastName;

	public Long getCustomerID() {
		return customerid;
	}
	
	public Customer(){	}

	public Customer(String firstName, String lastName) {
	
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Customer(Long customerid,String firstName, String lastName) {
		this.customerid=customerid;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	


	
	
	
}
