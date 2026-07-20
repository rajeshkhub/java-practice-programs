import java.util.*;
public class SortingCharacters {
	public static void main(String[] args) {
															// Character sorting.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word/string : ");
		String word = sc.next();
		char[] letters = word.toCharArray();				// word converted into character array.
		
		for(int i = 0; i < letters.length; i++) {			// for loop to iterate over character array.
			
			for(int j = i+1; j < letters.length; j++) {		// inner loop to iterate over character array from i+1 index.
				char letter = letters[i];					// each character is stored in letter variable.
				if(letters[j] < letters[i]) {				// checks if character at index j is greater than character at index i.
					letters[i] = letters[j];				// character at index j is stored at index i.
					letters[j] = letter;					// the letter variable which stored character at index i is stored at index j.
				}
			}
		}
		String word1 = new String(letters);					// character array is converted to string object.
		System.out.print("String after sorting : "+word1);
		sc.close();
	}
}
