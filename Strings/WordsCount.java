import java.util.*;
public class WordsCount {
	public static void main(String[] args) {
															// Counts number of words in a sentence.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String line = sc.nextLine();						// Input sentence.
		sc.close();											// Scanner closed.
		int count = 0;										// count variable counts number of words.		
		for(int i = 0; i < line.length(); i++) {			// for loop to iterate over input sentence.
			if(line.charAt(i) != ' ' && (i == 0 || line.charAt(i-1) == ' ')) 	// Checks if current character is not a space along with if index is at start or previous character is a space.
				count++;									// If the condition is true count increases.
		}
		System.out.println("Number of words are : "+count);
															// Or using string methods.
		//System.out.println(word.split("\\s+").length);
	}
}
