package ca1.task3;

public class ArrayCount {
	public int count(String[] array, String target) {
		
		// Counter
		int count = 0;
		
		// Loop through each element in the array
		for(int i = 0; i < array.length; i++) {
			
			// Check if the current string matches the target
			if (array[i].equals(target)) {
				count++;
			}
		}
		return 0;
	}
}