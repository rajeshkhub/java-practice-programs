import java.util.*;
public class FirstNonRepeatingChar {
	public static void main(String[] args) {
																				// First non repeating character finder.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word/string : ");
		String word = sc.next();
		boolean found = true;													// boolean found used to find if there is any non repeating character.
		
		for(int i = 0; i < word.length(); i++) {								// for loop for iteration over word.
			found = true;
			
			for(int j = 0; j < word.length(); j++) {							// Inner for loop to iterate over word by comparing i and j index character.
				if(i == j) continue;											// Skips if both i and j or on the same character.
				if(Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(j))) {
					found = false;												// if condition becomes true then found will be false.
					break;
				}
			}
			if(found) {															// if found is true then it prints first non repeating character.
				System.out.print("First non repeating character : "+word.charAt(i));
				break;
			}
		}
		if(!found) System.out.print("No non repeating character found");		// if found is false then it prints the statement.
		sc.close();
	}
}
