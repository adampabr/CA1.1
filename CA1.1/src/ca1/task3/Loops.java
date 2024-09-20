package ca1.task3;

public class Loops {
	public void printWords(int numberOfTimes) {
		
		// For loop the loops the amount of times the is input
		for(int i = 0; i < numberOfTimes; i++) {
			
			// Print "words"
			System.out.println("words");
		}
	}
	
	public static void main(String[] args) {
		
		// Initialise the method
		Loops loopTest = new Loops();
		
		// Call the method to test
		loopTest.printWords(10);
	}
}