package com.application.university.model;

import java.util.List;

public class Student extends Person {

	private List<Course> courses;

	public Student(String firstName, String lastName, int age, List<Course> courses) {
		super(firstName, lastName, age);
		this.courses = courses;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
