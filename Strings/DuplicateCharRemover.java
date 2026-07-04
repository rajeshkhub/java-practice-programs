import java.util.Scanner;
public class DuplicateCharRemover {
	public static void main(String[] args) {
		// Removes duplicate characters in given string using stringbuilder.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word/String :")
		String word = sc.next();
		sc.close();
		StringBuilder sb = new StringBuilder(word);                //Word passed to the StringBuilder constructor as argument.
		for(int i = 0; i < sb.length(); i++) {                     //i loop starts from 0 index of string word.
			for(int j = i+1; j < sb.length(); j++) {               //j loop starts from a index before i.
				if(Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(j))) {             //compares the characters of index i and index j in lowercase using Character.toLowercase() method.
					sb.deleteCharAt(j);                            //Deletes/removes the duplicate characters in the string.
					j--;                                           //decrements j by 1 so that comparison is performed on every character.
				}
			}
		}
		System.out.print("String after removing duplicates : "+sb);
	}
}
