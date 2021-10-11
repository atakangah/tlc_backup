package test.java.streams;

import main.java.basics.Student;
import main.java.abstracttypes.Register;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TotalHighestGradeTest {

	Student student1;
	Student student2;
	
	List<Double> fakeGrades1 = new ArrayList<Double>();
	List<Double> fakeGrades2 = new ArrayList<Double>();
	
	Register studentsRegister;
	
	@BeforeEach
	void setUp() throws Exception {
		fakeGrades1.add(35.00); // 63.55
		fakeGrades1.add(92.10);
		
		fakeGrades2.add(15.00); // 28.55
		fakeGrades2.add(42.10);
		
		this.student1 = new Student("John Doe", fakeGrades1);
		this.student2 = new Student("Jane Doe", fakeGrades1);
		
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		
		this.studentsRegister = new Register(students);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.student1 = null;
		this.student2 = null;
		this.fakeGrades1 = null;
		this.fakeGrades2 = null;
	}

	@Test
	void testHighestGradeReturned() {
		double highestGrade = this.studentsRegister.getHighestGrade();
		
		assertEquals(92.10, highestGrade, "Actual highest grade is not the same as expected highest grade");
	}

}
