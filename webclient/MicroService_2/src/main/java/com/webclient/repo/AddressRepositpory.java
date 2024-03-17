package com.webclient.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webclient.model.Address;
import java.util.List;


@Repository
public interface AddressRepositpory extends JpaRepository<Address, Integer>{
 
	
}
