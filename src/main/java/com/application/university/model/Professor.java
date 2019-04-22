package com.application.university.model;

import java.util.List;

public class Professor extends Person {

	private List<Student> students;

	public Professor(String firstName, String lastName, int age, List<Student> students) {
		super(firstName, lastName, age);
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
