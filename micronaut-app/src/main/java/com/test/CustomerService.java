package com.test;

import java.util.List;
import javax.inject.Singleton;
import java.util.Arrays;
@Singleton
public class CustomerService {
	 private static final List<Customer> customer = Arrays.asList(
	            new Customer("Jeff Carter"),
	            new Customer("Sai T"),
	            new Customer("Manoj Kumar Ravi"),
	            new Customer("Mandar"),
	            new Customer("Raghu")
	    );

	    public List<Customer> returnCustomer() { 
	        return customer;
	    }
}
