package com.webclient.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webclient.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
