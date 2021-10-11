package com.capgemini.movieTicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieTicketBooking.model.Customer;
import com.capgemini.movieTicketBooking.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer id) {
		
		return service.viewCustomer(id);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		
		return service.viewAllCustomers();
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return service.addCustomer(customer);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer")
	public Customer deleteCustomer(@RequestBody Customer customer) {
		
		return service.deleteCustomer(customer);
	}
	
}
