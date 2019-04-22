package com.application.university.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.university.mockdata.Mock;
import com.application.university.model.Student;

@RestController
public class StudentController {

	@Autowired
	private Mock mock;

	@GetMapping("/students")
	public List<Student> getStudents() {
		return mock.getStudents();
	}

}
