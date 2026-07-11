import java.util.Scanner;
class VowelCount {
	public static void main(String[] args) {
																				// Counts number of vowels in a string.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string/word : ");
			String word = sc.nextLine().toLowerCase();							// Turns the input string into lower case.
			int count = 0;
			char[] letters = word.toCharArray();       							// String becomes array of characters.
			for(char vowels : letters) {                                        // for each loop.
				if(vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u') {         // Compares characters with vowels.
				count++;														// Count increment.
				}
			}
			System.out.println("Number of vowels in the given string : "+count);
			sc.close();
	}
}
