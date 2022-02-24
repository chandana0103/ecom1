package com.abc.ecom1.service;

import java.util.List;

import com.abc.ecom1.entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);

	 public List<Customer> getAllCustomers();

	 public Customer getCustomerById(int customerId);

	 public void deleteCustomer(int customerId);

	 public Customer updateCustomer(Customer customer);
}