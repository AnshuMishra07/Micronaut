package com.test;
import io.micronaut.core.annotation.Introspected;

@Introspected 
public class Customer {
	private String name;
	
	public Customer(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
