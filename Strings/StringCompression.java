import java.util.*;
public class StringCompression {
	public static void main(String[] args) {
    													// Compresses string by replacing consecutive repeated char's with char followed by its count.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String word = sc.next();
		int num = 1;									// Used to store index to start with new group of characters.
		
		for(int i = 0; i < word.length(); i++) {		// Outer loop starts with 0 index.
			int count = 1;								// Used to count the number of consecutive repeating characters.
			
			for(int j = num; j < word.length(); j++) {	// Inner loop starts with index of num value.
				if(word.charAt(i) == word.charAt(j)) {	// Comparing characters.
					count++;							// Count increment if characters are same.
					num = j+2;							// num gets updated index to start with.
				}
				else {
					num = j+1;
					break;
				}
			}
			if(count > 1) {
				System.out.print(word.charAt(i)+""+count);
				i = num-2;
			}
			else System.out.print(word.charAt(i));
		}
    sc.close();
  }
}
