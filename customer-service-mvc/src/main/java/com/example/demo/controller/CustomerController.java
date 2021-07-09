package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Customer;
import com.example.demo.repository.CustomerRepository;

@Controller
public class CustomerController{
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private CustomerRepository repo;

	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("command", customer);
		return "addCustomer";
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Customer customer, Model model) {
	
		int rowAdded = repo.addCustomer(customer);
		model.addAttribute("rowAdded",rowAdded);
		return "addCustomer";
	}
	
	@RequestMapping(value="/customers/all", method=RequestMethod.GET)
	public String findAllCustomers(Model model) {
		
		List<Customer> list=repo.getAllCustomers();
		model.addAttribute("list", list);
		return "showCustomer";
	}
}
