package Part_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringManipTests {

	@Test
	void test() {
		assertEquals(123, sumStringDigits("abc123xyz"));
		assertEquals(44, sumStringDigits("aa11b33"));
		assertEquals(18, sumStringDigits("7 11"));
		assertEquals(0, sumStringDigits("Chocolate"));
		assertEquals(7, sumStringDigits("5hoco1a1e"));
		assertEquals(7, sumStringDigits("5$$1;;1!!"));
		assertEquals(1245, sumStringDigits("a1234bb11"));
		assertEquals(0, sumStringDigits(""));
		assertEquals(25, sumStringDigits("a22bbb3"));
	}
	
	
	/*
	 * Complete the sumStringDigits method so that it takes all the numbers from the String (0 - 9)
	 * and returns the sum of the numbers. 
	 * Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
	 * Note: Integer.parseInt(string) converts a string to an int.
	 * 
	 */
	public int sumStringDigits(String str) {
		return 0;
	}
	
	

}
