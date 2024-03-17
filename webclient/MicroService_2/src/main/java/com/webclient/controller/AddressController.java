package com.webclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.model.Address;
import com.webclient.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService service;
	
	@GetMapping("/address/{id}")
	public Address findAddress(@PathVariable int id) {
		return service.fetchAddress(id);
	}
	

}
