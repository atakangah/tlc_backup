package main.java.inheritance;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import main.java.basics.Student;

public class NaughtyStudent extends Student {

	public NaughtyStudent() {
		super(null);
	}

	public NaughtyStudent(List<Double> grades) {
		super(grades);
		List<Double> increasedGrades = grades.stream().map((grade) -> this.getTenPercentOf(grade))
				.collect(Collectors.toList());
		this.grades = increasedGrades;
	}

	private double getTenPercentOf(double grade) {
		return 0.1 * grade;
	}
}
