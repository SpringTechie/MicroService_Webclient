package com.webclient.respone;

import com.webclient.model.Address;
import com.webclient.model.Student;

public class ResponseObject {
	
	private Student student;
	
	private Address address;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
