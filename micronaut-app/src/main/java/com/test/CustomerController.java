package com.test;
import java.util.List;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
@Controller("/system")
public class CustomerController {
	
	private final CustomerService customers;

    public CustomerController(CustomerService customers) { 
        this.customers = customers;
    }

    @Get("/get/customer") 
    public List<Customer> getCustomer() { 
        return customers.returnCustomer();
    }

}
