package com.webclient.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webclient.model.Student;
import com.webclient.respone.ResponseObject;

public interface StudentService {
	public ResponseObject findStudent(Integer id);
}
