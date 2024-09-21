package ca1.task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarProcessingTest {

	@Test
	void testHashCodeMethod() {
	    Car car1 = new Car("Honda", "Civic", "Red");
	    Car car2 = new Car("Toyota", "Civic", "Red");

	    
	    assertEquals(car1.hashCode(), car2.hashCode(), "The decoding method does not work as expected.");
	}
	
	@Test
	void testToStringMethod() {
	    Car car = new Car("Honda", "Civic", "Red");
	    
	    
	    assertEquals("Honda, Civic, Red", car.toString(), "toString should return the correct format");
	}

}
