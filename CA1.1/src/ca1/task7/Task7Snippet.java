/**
 * 
 */
package ca1.task7;

/**
 * 
 */
public class Task7Snippet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};

		for (int i = 0; i < data.length; i++) {
            data[i] = data[i] * data[i]; 
		}

		int dataInt = 5;
		dataInt = dataInt + 5;
	}
	
	public static void printData(int[] data) {
		for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
		}
		System.out.println();
	}
	
	/**
	 * Q: Does the above code match the Python code in this comment. 
	 * If not, what is different? 
	 * and what needs to be done to make it match? 
	 *
	 * Python code:
	 * data = [1, 2, 3, 4, 5]
	 * for i in data:
     *    i = i * i
	 * data = 5
	 * data = data + 5
	 *
	 * A: The Java code is set to iterate only 3 times, rather than the length of the array, which is 5. 
	 * Changing the data variable to 5 was also not handled correctly, as it was using data[0], which would only set the first number in the array to 5.
	 * As we cannot convert an array to an integer in Java like we can in Python, we have to make a new variable.
	 */ 

}