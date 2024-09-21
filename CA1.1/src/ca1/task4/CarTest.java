package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testEquals() {
		Car car1 = new Car("Honda", "Civic", "Red");
		Car car2 = new Car("Holden", "Civic", "Red");
		Car car3 = new Car("Jeep", "Wrangler", "Blue");
		
		assertTrue(car1.equals(car2), "The decoding method does not work as expected.");
		
		assertFalse(car1.equals(car3), "The decoding method does not work as expected.");
	}

}
