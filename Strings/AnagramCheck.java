import java.util.Scanner;
public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Checks given two words are Anagram or not.
		
		System.out.println("Enter two strings : ");
		String word = sc.next().toLowerCase();
		String word2 = sc.next().toLowerCase();
		boolean found = false;
		boolean[] visited = new boolean[word2.length()];               //Boolean array to store visited or not, in indexes parallel to the second string indexes.
		if(word.length() == word2.length()) {                          //Checks whether the two strings have equal lenghts.
			for(int i = 0; i < word.length(); i++) {                   //Iteration over first string.
				found = false;
				for(int j = 0; j < word2.length(); j++) {              //Iteration over second string.
					if(!visited[j]) {                                  //Checks if the boolean array element at index j is visited or not.
						if(word.charAt(i) == word2.charAt(j)) {        //Compares character of first string at index i with character of second string with index j.
							found = true;                              //Assigns true to found if the above condition is true.
							visited[j] = true;                         // Marks the visited array true at index j.
							break;
						}
					}
				}
				if(!found) break;                                       //checks if found is false(found becomes false if any element doesnt match) and breaks the loop.
			}
		}
		String result = (found)? "Anagrams" : "Not Anagrams";      		 //Generates result using terinary operator.
		System.out.println("The given two strings are "+result);
	}
}
