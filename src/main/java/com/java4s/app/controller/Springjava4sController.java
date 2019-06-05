package com.java4s.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.app.model.Customer;
import com.java4s.app.repository.SpringJava4sDAO;

@RestController
public class Springjava4sController {

	@Autowired
	public SpringJava4sDAO dao;
	
	@RequestMapping("/getCutomerInfo")
	public List<Customer> customerInformation()
	{
		List<Customer> customers = dao.isData(); 
		System.out.println("customers--->"+customers.toArray());
		for(Customer result : customers)
		{
			int id = result.getCustNo();
			String cn = result.getCustName();
			String cc= result.getCountry();
			System.out.println("CustomerNo ---->"+id+"\n"+"Customername---->"  +cn+"\n"+"Country--->: "+cc);
		}
		return customers;
		
		
	}
	@RequestMapping("/Hello")
	public String sayHello()
	{
		
		return "Welcome to spring boot Application";
		
		
	}
}
