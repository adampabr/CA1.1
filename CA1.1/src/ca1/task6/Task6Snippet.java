/**
 * 
 */
package ca1.task6;

/**
 * 
 */
public class Task6Snippet {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// In case you need to test the methods

	}
	
	/**
	 * Snippet #1: Access the 2nd and 5th elements of the array and report them 
	 */
	public static void accessElements() {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int secondElement = numbers[1];
		int fifthElement = numbers[4];
		System.out.println("Second element: " + secondElement);
		System.out.println("Fifth element: " + fifthElement);
	}
	
	/**
	 * Q: What is wrong with the above method? Fix any issues and explain the problems below.
	 *
	 * A: The numbers to access the elements were wrong, as the array count starts at 0, you need to offset by -1.
	 * The print statements also had the wrong variables in them.
	 */
	
	
	/**
	 * Snippet #2: Increase the value of "a" 10 times in increments of 2.
	 * @param a the value to increase
	 * @param b a counter to keep track of how many times "a" has been increased
	 */
	public static void increaseA(int a, int b) {
		while (b < 10) {
			a += 2;
			b++;	
		}
	}
	
	/**
	 * Q: What is wrong with the above method? Fix any issues and explain the problems below.
	 *
	 * A: The a variable was only being increased by 1, changed to 2.
	 * There was no need for this if statement, because if you started with an odd number, it would never be true.
	 */
	
	
	/**
	 * Snippet #3: Find the index of the target value inside of an array
	 * @param numbers the array to search
	 * @param target the value to find
	 * @return the index of the target value or -1 if it is not found
	 */
	public static int findIndex(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				return i;
			}
		}
		return -1;
	}
       
	
	/**
	 * Q: What is wrong with the above method? Fix any issues and explain the problems below.
	 *
	 * A: The numbers of iterations in the for loop should not be set to a fixed number, instead it should be the length of the array.
	 * The i++ is not necessary within the for loop as it already increments when the for loop is created.
	 */ 

}