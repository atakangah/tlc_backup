package main.java.basics;

import java.util.*;

public class Lecture {

	private double highestAverageGrade;
	private List<Student> students = new ArrayList<Student>();

	public void enter(Student student) {
		if (student != null)
			this.students.add(student);
	}

	public Student findStudent(Student student) {
		for (Student aStudent : this.students)
			if (aStudent == student)
				return aStudent;
		return null;
	}

	public void calculateHighestAverageGrade() {
		this.highestAverageGrade = this.students.get(0).getAverageGrade();
		for (Student aStudent : this.students)
			if (aStudent.getAverageGrade() > this.highestAverageGrade)
				this.highestAverageGrade = aStudent.getAverageGrade();
	}

	public double getHighestAverageGrade() {
		return this.highestAverageGrade;
	}
}
