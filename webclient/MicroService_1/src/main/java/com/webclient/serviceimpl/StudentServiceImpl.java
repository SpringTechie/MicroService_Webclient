package com.webclient.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.webclient.model.Address;
import com.webclient.model.Student;
import com.webclient.repo.StudentRepository;
import com.webclient.respone.ResponseObject;
import com.webclient.service.StudentService;

import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService  {
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private WebClient webClient;

	@Override
	public ResponseObject findStudent(Integer id) {
		
		
		 Address address = webClient.get()
	    .uri("http://localhost:9090/address/{id}", id)
	    .retrieve()
	    .bodyToMono(Address.class)
	    .block();
		 
		 
		 ResponseObject r = new ResponseObject();
		 r.setAddress(address);
		 Student student = repo.findById(id).get();
		 r.setStudent(student);
		 
	
		return r;
	}

}
