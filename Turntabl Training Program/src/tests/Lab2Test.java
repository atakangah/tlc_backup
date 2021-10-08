package tests;

import static org.junit.jupiter.api.Assertions.*;
import labs.Lab2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab2Test {
	
	Lab2 lab2;

	@BeforeEach
	void setUp() throws Exception {
		lab2 = new Lab2();
	}

	@AfterEach
	void tearDown() throws Exception {
		lab2 = null;
	}

	@Test
	void testArrayNotNull() {		
		assertNotNull(lab2.getMyArray(), "Array is null");
	}
	
	@Test
	void testArrayLengthValid() {
		assertEquals(lab2.getMyArraySize(), 6, "Array length not equal to 6");
	}
	
	@Test
	void testArrayElementValid() {
		assertTrue(Integer.class.isInstance(lab2.getMyArray()[0]), "Array element is not an integer");
	}
	
	@Test
	void testArrayIsSorted() {
		lab2.sortMyArray();
		for (int i = 1; i < lab2.getMyArraySize(); i++) {
			assertTrue(lab2.getMyArray()[i-1] < lab2.getMyArray()[i]);
		}
	}
}
