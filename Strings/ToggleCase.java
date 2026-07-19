import java.util.*;
public class ToggleCase {
	public static void main(String[] args) {
    														// Toggle case.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String word = sc.nextLine();
		System.out.print("Toggled string : ");
		for(int i = 0; i < word.length(); i++) {			// for loop to iterate over word.
			char letter = word.charAt(i);					// aquiring single characters from string and storing in letter.
			if(Character.isUpperCase(letter)) System.out.print(Character.toLowerCase(letter));		// using static method of Character wrapper class.
			else System.out.print(Character.toUpperCase(letter));									// to check and print toggled character.
		}
		sc.close();
	}
}
