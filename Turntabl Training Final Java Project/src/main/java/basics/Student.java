package main.java.basics;

import java.text.DecimalFormat;
import java.util.List;
import main.java.abstracttypes.Nameable;

public class Student implements Nameable {
	
	protected List<Double> grades;
	private double averageGrade;
	private String name;
	
	public Student(List<Double> grades) {
		this("Undefined", grades);
	}

	public Student(String name, List<Double> grades) {
		this.name = name;
		this.grades = grades;
	}
	
	public void calculateAverageGrade() {
		double totalGrades = 0;
		for (Double grade : grades) {
			totalGrades+=grade;
		}
		this.averageGrade = totalGrades/grades.size();
	}
	
	public double getAverageGrade() {
		return Double.valueOf(new DecimalFormat("###.##").format(this.averageGrade));
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
