package test.java.inheritance;
import main.java.basics.Student;
import main.java.inheritance.NaughtyStudent;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IncreasedAverageGradeTest {
	Student student;	
	List<Double> fakeGrades = new ArrayList<Double>();
	
	@BeforeEach
	void setUp() throws Exception {
		fakeGrades.add(35.00); // 63.55
		fakeGrades.add(92.10);
		
		this.student = new NaughtyStudent(fakeGrades);
		this.student.calculateAverageGrade();
	}

	@AfterEach
	void tearDown() throws Exception {
		this.fakeGrades = null;		
		this.student = null;
	}

	@Test
	void testIncreasedTenPercentGrades() {
		//expected 15.73564
		assertEquals(6.35, this.student.getAverageGrade(), "Student average grade is not 10% higher than reported");
	}

}
