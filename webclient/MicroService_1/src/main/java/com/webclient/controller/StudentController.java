package com.webclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.model.Student;
import com.webclient.respone.ResponseObject;
import com.webclient.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/findstudent/{id}")
	public ResponseObject findStudentAndAddress(@PathVariable Integer id) {
		return service.findStudent(id);
	}

}
