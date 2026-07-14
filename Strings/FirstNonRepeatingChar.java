import java.util.*;
public class FirstNonRepeatingChar {
	public static void main(String[] args) {
																				//First non repeating character
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		
		for(int i = 0; i < word.length(); i++) {
			found = false;
			
			for(int j = 0; j < word.length(); j++) {
				if(i == j) continue;
				if(Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(j))) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.print(word.charAt(i));
				break;
			}
		}
		if(found) System.out.print("No non repeating character found");
		sc.close();
	}
}
