package test.java.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.abstracttypes.Register;
import main.java.basics.Student;

class AverageOfAllStudentsGradesTest {

	List<Double> fakeGrades1 = new ArrayList<Double>();
	List<Double> fakeGrades2 = new ArrayList<Double>();
	
	Student student1;
	Student student2;
	
	Register studentsRegister;
	
	@BeforeEach
	void setUp() throws Exception {
		fakeGrades1.add(35.00); // 63.55
		fakeGrades1.add(92.10);
		
		fakeGrades2.add(15.00); // 28.55
		fakeGrades2.add(42.10);
		
		// 184.20
		
		this.student1 = new Student("John Doe", fakeGrades1);
		this.student2 = new Student("Jane Doe", fakeGrades2);
		
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		
		this.studentsRegister = new Register(students);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.fakeGrades1 = null;
		this.fakeGrades2 = null;
		
		this.student1 = null;
		this.student2 = null;
		
		this.studentsRegister = null;
	}

	@Test
	void testAllStudentsAverageGrade() {
		double highestStudentsAvarage = this.studentsRegister.getAllStudentsAverageGrade();
		assertEquals(46.05, highestStudentsAvarage, "Highest students average is not the same as expected");
	}

}
