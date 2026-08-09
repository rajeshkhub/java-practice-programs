import java.util.*;
public class StringCompression {
	public static void main(String[] args) {
    													// Compresses string by replacing consecutive repeated char's with char followed by its count.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String word = sc.next();
		System.out.print("String after compressing : ");
		
		for(int i = 0; i < word.length(); i++) {		// Outer loop starts with 0 index.
			int count = 1;								// Used to count the number of consecutive repeating characters.
			
			for(int j = i+1; j < word.length(); j++) {	// Inner loop starts with index of num value.
				if(word.charAt(i) == word.charAt(j))	// Comparing characters.
					count++;							// Count increment if characters are same.
				else break;								// else break inner loop.
			}
			if(count > 1) {								// Checks if count greater than one.
				System.out.print(word.charAt(i)+""+count);		// Prints character and number of consecutive similar characters.
				i += count-1;							// i gets incremented by count-1.
			}
			else System.out.print(word.charAt(i));		// else prints single character.
		}
    sc.close();
  }
}
