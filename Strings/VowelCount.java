import java.util.Scanner;
class VowelCount {
	public static void main(String[] args) {
		// Counts number of vowels in a string.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string/word : ");
			String word1 = sc.nextLine();
			String word2 = word1.toLowerCase();
			int count = 0;
			char[] a = word2.toCharArray();       //String becomes array of characters
			for(char b : a) {                                               //for each loop
				if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u') {         
				c++;
				}
				else {}
			}
			System.out.println("Number of vowels in the given string : "+count);
			sc.close();
	}
}
