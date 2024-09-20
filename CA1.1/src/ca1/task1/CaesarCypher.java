package ca1.task1;

public class CaesarCypher {
	
	// Method that takes characters in an array and and integer to offset the characters
	public char[] encode(char[] input, int offset) {
		
		// An array the will gold the result
		char[] result = new char[input.length];
		
		// Loop through each character
		for (int i = 0; i < input.length; i++) {
			char c = input[i];
			
			// Make sure the character is a letter 
			if(Character.isLetter(c)) {
				
				// Shift the character based on the input offset.
				// Use modulo 26 in case the letter wraps around to the end of the alphabet
				char shifted = (char) ((c - 'a' + offset) % 26 + 'a');
				result[i] = shifted;
			
			} else {
				// Leave character if it isn't letter
				result[i] = c;
			}
		}
		
		return result;
	}
	
	// Method to decode
	public char[] decode(char[] input, int offset) {
		
		// Uses the encode method, but in reverse
		return encode(input, 26 - offset);
	}
}