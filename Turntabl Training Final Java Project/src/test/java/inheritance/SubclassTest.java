package test.java.inheritance;
import main.java.inheritance.NaughtyStudent;
import main.java.basics.Student;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubclassTest {

	Student aNaughtyStudent;
	
	@BeforeEach
	void setUp() throws Exception {
		this.aNaughtyStudent = new NaughtyStudent();
	}

	@AfterEach
	void tearDown() throws Exception {
		this.aNaughtyStudent = null;
	}

	@Test
	void test() {
		assertTrue(this.aNaughtyStudent instanceof main.java.basics.Student, "Naughty student is not a type of Student");
	}

}
