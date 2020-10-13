package palendromeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilitiesTest {

	//This is the JUnit test to test cases for the method isPalendrome()
	@Test
	void testIsPalendrome() {
		String tc1 = "racecar";
		String tc2 = "Was it a car or a cat I saw";
		
		assertTrue(Utilities.isPalendrome(tc1));
		assertTrue(Utilities.isPalendrome(tc2));
	}

	//This is the JUnit test to test cases for the method BubbleSort()
	@Test
	void testBubbleSort() {
		int[] tc1 = {5};
		int[] tc1Expected = {5};
		Utilities.BubbleSort(tc1);
		assertArrayEquals(tc1Expected,tc1);
		
		
		int[] tc2 = {100, 50, 25, 10, 0};
		int[] tc2Expected = {0, 10, 25, 50, 100};
		Utilities.BubbleSort(tc2);
		assertArrayEquals(tc2Expected,tc2);
		
		int[] tc3 = {6,6,6,6,6};
		int[] tc3Expected = {6,6,6,6,6};
		Utilities.BubbleSort(tc3);
		assertArrayEquals(tc3Expected,tc3);
 	}
	
	//This is the JUnit test to test cases for the method factorial()
	@Test
	void testFactorial() {
		int tc1 = 5;
		int tc4 = 6;
		int tc1Expected = 120;
		assertEquals(1, Utilities.factorial(0));
		assertEquals(tc1Expected, Utilities.factorial(tc1));
		assertEquals(720, Utilities.factorial(tc4));
	}
}
