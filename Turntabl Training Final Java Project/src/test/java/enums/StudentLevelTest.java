package test.java.enums;

import main.java.abstracttypes.Nameable;
import main.java.basics.Student;
import main.java.abstracttypes.Register;
import main.java.enums.Level;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentLevelTest {
	List<Nameable> students;
	Register studentsRegister;

	@BeforeEach
	void setUp() {
		this.students = new ArrayList();
		this.students.add(new Student("John Doe", Level.FRESHER));
		this.students.add(new Student("Jane Doe", Level.FRESHER));
		this.students.add(new Student("Mark Doe", Level.SENIOR));
		this.students.add(new Student("David Doe", Level.SOPHOMORE));
		this.students.add(new Student("Fred Doe", Level.JUNIOR));

		this.studentsRegister = new Register(this.students);
	}

	@AfterEach
	void tearDown() {
		this.studentsRegister = null;
		this.students = null;
	}

	@Test
	void test() {
		List<String> fresherStudents = this.studentsRegister.getRegisterByLevel(Level.FRESHER);

		assertEquals(2, fresherStudents.size(), "Fresher students are more than 1");
		assertEquals("John Doe", fresherStudents.get(0));
		assertEquals("Jane Doe", fresherStudents.get(1));
	}

}
