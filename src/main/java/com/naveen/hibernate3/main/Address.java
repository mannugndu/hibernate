package com.naveen.hibernate3.main;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String location;
	
	public Address()
	{
		
	}
	
	@Override
	public String toString() {
		return "Address [location=" + location + "]";
	}

	public Address(String address)
	{
		this.location = address;
	}
	
	
	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
