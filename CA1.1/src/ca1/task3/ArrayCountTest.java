package ca1.task3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayCountTest {

	@Test
	void testNoTarget() {
		ArrayCount ac = new ArrayCount();
		String[] array = {"Brown", "Red", "Orange"};
		int result = ac.count(array, "Blue");
		assertEquals(0, result,  "The decoding method does not work as expected.")
	}

}
