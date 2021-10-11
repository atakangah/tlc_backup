package main.java.basics;

import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
import main.java.enums.Level;
import main.java.enums.HasLevel;
import main.java.abstracttypes.Nameable;

public class Student implements Nameable, HasLevel {
	
	protected List<Double> grades;
	private double averageGrade;
	private String name;
	private Level level;
	
	
	public Student(String name, Level level) {
		this(name, level, new ArrayList<Double>());
	}
	
	public Student(List<Double> grades) {
		this("Undefined", grades);
	}

	public Student(String name, List<Double> grades) {
		this(name, Level.FRESHER, grades);
	}
	
	public Student(String name, Level level, List<Double> grades) {
		this.name = name;
		this.level = level;
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
	
	@Override
	public Level getLevel() {
		return this.level;
	}
}
