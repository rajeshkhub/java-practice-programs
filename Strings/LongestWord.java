import java.util.*;
public class LongestWord {
  public static void main(String[] args) {
                                                  // Longest word in a sentence.
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine().trim();
		String[] words = sentence.split(" ");        // String array stores words in the sentence.
		String oneWord = words[0];
    
		for(String word : words) {                  // For each loop. 
      if(oneWord.length() < word.length()) {
        oneWord = word;
			}
		}
		System.out.println(oneWord);
    sc.close();
  }
}
