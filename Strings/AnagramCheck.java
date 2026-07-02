import java.util.*;
public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Checks given two words are Anagram or not.
		System.out.println("Enter two strings : ");
		String word = sc.next().toLowerCase();
		String word2 = sc.next().toLowerCase();
		boolean found = false;
		boolean[] visited = new boolean[word2.length()];
		if(word.length() == word2.length()) {
			for(int i = 0; i < word.length(); i++) {
				found = false;
				for(int j = 0; j < word2.length(); j++) {
					if(!visited[j]) {
						if(word.charAt(i) == word2.charAt(j)) {
							found = true;
							visited[j] = true;
							break;
						}
					}
				}
				if(!found) break;
			}
		}
		if(found) System.out.println("Anagram");
		else System.out.println("Not anagram");
