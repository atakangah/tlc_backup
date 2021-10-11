package test.java.abstracttypes;

import main.java.basics.Student;
import main.java.abstracttypes.Register;
import main.java.abstracttypes.Nameable;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListOfStudentNamesTest {

	Student student1;
	Student student2;
	Student student3;
	Student student4;
	
	List<Double> fakeGrades1 = new ArrayList<Double>();
	List<Double> fakeGrades2 = new ArrayList<Double>();
	List<Double> fakeGrades3 = new ArrayList<Double>();
	List<Double> fakeGrades4 = new ArrayList<Double>();	
	
	List<Nameable> registrations = new ArrayList<Nameable>();
	
	@BeforeEach
	void setUp() throws Exception {
		this.student1 = new Student("John Doe", fakeGrades1);
		this.student2 = new Student("Philis Doe", fakeGrades2);
		this.student3 = new Student("Mark Doe", fakeGrades3);
		this.student4 = new Student("David Doe", fakeGrades4);
		
		this.registrations.add(student1);
		this.registrations.add(student2);
		this.registrations.add(student3);
		this.registrations.add(student4);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.student1 = null;
		this.student2 = null;
		this.student3 = null;
		this.student4 = null;
		
		this.fakeGrades1 = null;
		this.fakeGrades2 = null;
		this.fakeGrades3 = null;
		this.fakeGrades4 = null;
	}

	@Test
	void testStudentNamesListReturned() {
		Register studentRegistration = new Register(this.registrations);
		List<String> studentsNameObjs = studentRegistration.getRegister();
		
		for (String name : studentsNameObjs) {
			assertTrue(name instanceof java.lang.String, "Nameable is not a type of String");
			assertFalse(name.equals("Undefined"), "Student name is undefined");
			assertFalse(name.isEmpty(), "Nameable name is empty");
		}
	}

}
