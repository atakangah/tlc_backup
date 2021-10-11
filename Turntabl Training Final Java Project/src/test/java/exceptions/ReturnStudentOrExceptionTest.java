package test.java.exceptions;

import main.java.basics.Student;
import main.java.enums.Level;
import main.java.exceptions.StudentNotFoundException;
import main.java.abstracttypes.Register;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReturnStudentOrExceptionTest {

	List<Student> students = new ArrayList();
	Register studentRegister;
	
	@BeforeEach
	void setUp() throws Exception {
		Student student1, student2, student3;
		
		student1 = new Student("John Doe", Level.FRESHER);
		student2 = new Student("Jane Doe", Level.SENIOR);
		student3 = new Student("David Doe", Level.JUNIOR);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		this.studentRegister = new Register(students);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.students = null;
		this.studentRegister = null;
	}

	@Test
	void testReturnsStudent() {
		try {
			Student theStudent = this.studentRegister.getStudent("David Doe");
			assertEquals("David Doe", theStudent.getName(), "David doe was not returned from method");
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testThrowsStudentNotFoundException() {
		assertThrows(StudentNotFoundException.class, () -> {
			this.studentRegister.getStudent("Philip Doe");
		});
	}

}
