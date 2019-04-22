package com.application.university.mockdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.application.university.model.Course;
import com.application.university.model.Professor;
import com.application.university.model.Student;

@Service
public class Mock {

	private List<Course> courses = new ArrayList<>();
	private List<Student> students = new ArrayList<>();
	private List<Professor> professors = new ArrayList<>();

	public Mock() {
		Course c1 = new Course("Java");
		Course c2 = new Course("Docker");
		Course c3 = new Course("Springboot");
		Course c4 = new Course("Javascript");
		Course c5 = new Course("Angular");

		getCourses().add(c1);
		getCourses().add(c2);
		getCourses().add(c3);
		getCourses().add(c4);
		getCourses().add(c5);

		Student s1 = new Student("Ionescu", "Ciprian", 23, getCourses());
		Student s2 = new Student("Berghescu", "Ionut", 20, getCourses());
		Student s3 = new Student("Porumbescu", "Marius", 19, getCourses());
		Student s4 = new Student("Dumitrescu", "Andrei", 22, getCourses());
		Student s5 = new Student("Francescu", "Ionel", 20, getCourses());

		getStudents().add(s1);
		getStudents().add(s2);
		getStudents().add(s3);
		getStudents().add(s4);
		getStudents().add(s5);

		Professor p1 = new Professor("Popescu", "Ana", 33, getStudents());
		Professor p2 = new Professor("Iliescu", "Dumitru", 40, getStudents());
		Professor p3 = new Professor("Ionescu", "Claudiu", 30, getStudents());
		Professor p4 = new Professor("Popescu", "Ion", 53, getStudents());
		Professor p5 = new Professor("Fetescu", "Ghita", 29, getStudents());

		getProfessors().add(p1);
		getProfessors().add(p2);
		getProfessors().add(p3);
		getProfessors().add(p4);
		getProfessors().add(p5);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

}
