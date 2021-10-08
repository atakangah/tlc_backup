package test.java.basics;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.basics.Student;

class AverageGradeTest {

	List<Double> fakeGrades = new ArrayList<Double>();
	@BeforeEach
	void setUp() throws Exception {
		this.fakeGrades.add(35.00);
		this.fakeGrades.add(92.10);
		this.fakeGrades.add(42.00);
		this.fakeGrades.add(32.05);
		this.fakeGrades.add(82.92);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.fakeGrades = null;
	}

	@Test
	void testAverageGrade() {
		Student aStudent = new Student(this.fakeGrades);
		aStudent.calculateAverageGrade();
		assertEquals(56.814, aStudent.getAverageGrade(), "Actual average grade not equal to expected average grade");
	}

}
