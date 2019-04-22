package com.application.university.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.university.mockdata.Mock;
import com.application.university.model.Professor;

@RestController
public class ProfessorController {

	@Autowired
	private Mock mock;

	@GetMapping("/professors")
	public List<Professor> getProfessors() {
		return mock.getProfessors();
	}

}
