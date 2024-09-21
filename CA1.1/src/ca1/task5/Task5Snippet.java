/**
 * 
 */
package ca1.task5;

/**
 * 
 */
public class Task5Snippet {

    public static String decipher(String input) {
        // Step 1: Takes the input word, sleuth in this case. 
    	// Gets the length over the word and minuses 1
    	// Creates a string with the letters in reverse, minus the first letter
        String a = "";
		for (int i = input.length() - 1; i > 0; i--) {
			a += input.charAt(i);
		}
        
        // Step 2: Replaces the vowels with numbers based on the below
        String b = a
                .replaceAll("a", "1")
                .replaceAll("e", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("u", "5");

        // Step 3: Converts the string into an array and randomly swaps characters
        char[] c = b.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int randomIndex = (int) (Math.random() * c.length);
            char temp = c[i];
            c[i] = c[randomIndex];
            c[randomIndex] = temp;
        }

        // Step 4: Returns the converted string
        return new String(c);
    }

    public static void main(String[] args) {
        String mysteryInput = "sleuth";
        String mysteriousOutput = decipher(mysteryInput);
        System.out.println("The cryptic result: " + mysteriousOutput);
    }
	
	/**
	 * Q: What does the decipher() method do? explain the code below. 
	 * NOTE: You may find it useful to refer to either Line numbers or the various steps marked within the code.
	 *
	 * A: Takes a string as an input, then reverses the string, minus the first letter. After this it replaces the vowels with numbers.
	 * 	  Finally, it randomly shuffles the string and returns it.
	 */ 

}