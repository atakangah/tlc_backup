package tests;

import labs.*;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab1Test {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {

		assertThrows("Test failed. TestException was not thrown", TestException.class, () -> {
			Lab1 lab1 = new Lab1();
			
			int[] myArray = lab1.getMyArray();
			
			assertEquals(myArray[0], 1);
			assertEquals(myArray[1], 2);
			assertEquals(myArray[2], 3);
			
			throw new TestException();
		});

		}

}
