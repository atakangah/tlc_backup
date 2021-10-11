package main.java.abstracttypes;

import main.java.basics.Student;
import main.java.inheritance.NaughtyStudent;
import main.java.exceptions.StudentNotFoundException;
import main.java.enums.Level;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
	private final List<? super NaughtyStudent> registeredStudents;
	private Comparator<Double> studentHighestGradeComparator = new Comparator<>() {
		@Override
		public int compare(Double s1, Double s2) {
			return s1 > s2 ? 1 : s1 == s2 ? 0 : -1;
		}
	};

	public Register(List<? super NaughtyStudent> students) {
		this.registeredStudents = students;
	}

	public List<String> getRegister() {
		return this.registeredStudents.stream().map((student) -> ((Student) student).getName())
				.collect(Collectors.toList());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<Level, List<Student>> getRegisterByLevel(Level level) {
		Map<Level, List<Student>> registerLevelMap = new HashMap();
		List<? super NaughtyStudent> registeredStudentsOfLevel = registeredStudents.stream()
				.filter((student) -> ((Student) student).getLevel() == level).collect(Collectors.toList());
		registerLevelMap.put(level, (List<Student>) registeredStudentsOfLevel);
		return registerLevelMap;
	}

	@SuppressWarnings({ "unchecked" })
	public List<? super NaughtyStudent> sort(Comparator<? super NaughtyStudent> comparator) {
		Collections.sort((List<Student>) this.registeredStudents, (Comparator<Student>) comparator);
		return this.registeredStudents;
	}

	public Student getStudent(String studentName) throws StudentNotFoundException {
		Student theStudent = (Student) this.registeredStudents.stream()
				.filter((student) -> ((Student) student).getName().equals(studentName)).findFirst().orElse(null);
		if (theStudent == null)
			throw new StudentNotFoundException("No such student found");
		return theStudent;
	}

	public double getHighestGrade() {
		return this.registeredStudents.stream().map((input) -> ((Student) input).getHighestGrade()).max(this.studentHighestGradeComparator).orElse(0.0);
	}
	
	@SuppressWarnings({ "unchecked" })
	public double getAllStudentsAverageGrade() {
		double totalGrades = 0.0;
		int numberOfGrades = 0;
		for(Student student : (List<Student>) this.registeredStudents) {
			totalGrades+=student.getGrades().stream().reduce(0.0, (subtotal, grade) -> subtotal+grade);
			numberOfGrades+=student.getGrades().stream().count();
		}
		return totalGrades/numberOfGrades;
	}

	
	public List<Double> getGradesAboveSixtyPercent() {
		List<Double> aboveSixtyPercentGrades = new ArrayList<Double>();
		for (Student student : (List<Student>) this.registeredStudents) {
			student.getGrades().stream().filter((grade) -> grade > 60).forEach((grade) -> aboveSixtyPercentGrades.add(grade));
		}
		return aboveSixtyPercentGrades;
	}
	
	
	public Optional<Student> getStudentByName(String studentName) {
		Student theStudent = (Student) this.registeredStudents.stream().filter((student) -> ((Student) student).getName().equals(studentName)).findFirst().orElse(null);
		if (theStudent != null) return Optional.of(theStudent);
		return Optional.empty();
	}
	
	
	public String printReport() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s \t %s\n", "Name", "Level"));
		this.registeredStudents.stream().map(
				(student) -> String.format("%s \t %s\n", ((Student) student).getName(), ((Student) student).getLevel()))
				.forEach((formattedStudent) -> sb.append(formattedStudent));
		return sb.toString();
	}

}
