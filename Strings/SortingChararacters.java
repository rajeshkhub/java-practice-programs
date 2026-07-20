import java.util.*;
public class SortingCharacters {
	public static void main(String[] args) {
															// Character sorting
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] letters = word.toCharArray();
		for(int i = 0; i < letters.length; i++) {
			for(int j = i+1; j < letters.length; j++) {
				char letter = letters[i];
				if(letters[j] < letters[i]) {
					letters[i] = letters[j];
					letters[j] = letter;
				}
			}
		}
		String word1 = new String(letters);
		System.out.print(word1);
		
		sc.close();
	}
}
