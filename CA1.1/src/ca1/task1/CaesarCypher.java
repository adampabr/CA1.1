package ca1.task1;

public class CaesarCypher {

	public char[] encode(char[] input, int offset) {
		char[] result = new char[input.length];
		
		for (int i = 0; i < input.length; i++) {
			char c = input[i];
			
			if(Character.isLetter(c)) {
				char shifted = (char) ((c - 'a' + offset) % 26 + 'a');
				result[i] = shifted;
			
			} else {
				result[i] = c;
			}
		}
		
		return result;
	}
	
	public char[] decode(char[] input, int offset) {
		return encode(input, 26 - offset);
	}
}