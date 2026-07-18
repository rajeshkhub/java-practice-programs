import java.util.*;
public class ToggleCase {
	public static void main(String[] args) {
    														// Toggle case.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String word = sc.nextLine();
		System.out.print("Toggled string : ");
		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if(Character.isUpperCase(letter)) System.out.print(Character.toLowerCase(letter));
			else System.out.print(Character.toUpperCase(letter));
		}
		sc.close();
	}
}
