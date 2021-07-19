package com.training.model;

public class Customer implements  Comparable<Customer> {
	private int id;
	private String CustomerName;
	private String email;
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public Customer(int id, String customerName, String email) {
		super();
		this.id = id;
		CustomerName = customerName;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", CustomerName=" + CustomerName + ", email=" + email + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
