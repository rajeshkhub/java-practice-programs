import java.util.*;
public class WordsCount {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String line = sc.nextLine();
		sc.close();
		int count = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) != ' ' && (i == 0 || line.charAt(i-1) == ' ')) 
				count++;
		}
		System.out.println("Number of words are : "+count);
	}
}
