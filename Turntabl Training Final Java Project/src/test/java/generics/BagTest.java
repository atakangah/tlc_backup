package test.java.generics;

import main.java.basics.Student;
import main.java.enums.Level;
import main.java.generics.BagOfStudents;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BagTest {
	
	Student student1;
	Student student2;
	BagOfStudents studentBag;
	
	@BeforeEach
	void setUp() {
	    this.student1 = new Student("Jon Doe", Level.FRESHER);
	    this.student2 = new Student("David Doe", Level.SOPHOMORE);
	    this.studentBag = new BagOfStudents();
	}
	
	@AfterEach
	void tearDown() {
		this.student1 = null;
		this.student2 = null;
		this.studentBag = null;
	}

	@Test
	void test() {
		this.studentBag.add(student1);
		this.studentBag.remove(student1);
	}

}
