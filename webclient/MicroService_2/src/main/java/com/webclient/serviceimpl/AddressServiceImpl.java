package com.webclient.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webclient.model.Address;
import com.webclient.repo.AddressRepositpory;
import com.webclient.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepositpory repo;

	@Override
	public Address fetchAddress(int sid) {
		return repo.findById(sid).get();
	
	}

}
