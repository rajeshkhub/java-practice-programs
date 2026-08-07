import java.util.*;
public class WordsCount {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String word = sc.nextLine();
		sc.close();
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
		if(word.charAt(i) != ' ' && (i == 0 || word.charAt(i-1) == ' ')) count++;
		}
		System.out.println(count);
