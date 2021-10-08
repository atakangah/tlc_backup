package test.java.basics;

import static org.junit.jupiter.api.Assertions.*;
import main.java.basics.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HighestAverageGradeTest {
	List<Double> fakeGrades1 = new ArrayList<Double>();
	List<Double> fakeGrades2 = new ArrayList<Double>();

	@BeforeEach
	void setUp() throws Exception {
		fakeGrades1.add(35.00); // 63.55
		fakeGrades1.add(92.10);
		
		fakeGrades2.add(15.00); // 28.55
		fakeGrades2.add(42.10);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.fakeGrades1 = null;
		this.fakeGrades2 = null;
	}

	@Test
	void testHighestGradeAverage() {
		Lecture aLecture = new Lecture();
		
		Student aStudent1 = new Student(fakeGrades1);
		Student aStudent2 = new Student(fakeGrades2);
		
		aStudent1.calculateAverageGrade();
		aStudent2.calculateAverageGrade();
		
		aLecture.enter(aStudent1);
		aLecture.enter(aStudent2);
		
		aLecture.calculateHighestAverageGrade();
		double highestAverage = aLecture.getHighestAverageGrade();
		
		assertEquals(63.55, highestAverage, "Actual average grade does not match expected highest average grade");
	}

}
