package com.model;

public class Address {
	private String street;
	private String city;
	private String zipCode;
	private String state;
	private User user;
	
	public Address() {
	}

	public Address(String street, String city, String zipCode, String state, User user) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.user = user;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", state=" + state + ", user="
				+ user + "]";
	}
}
