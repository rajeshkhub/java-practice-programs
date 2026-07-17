import java.util.*;
public class StringRotationCheck {
	public static void main(String[] args) {
    																	// Strings rotation checker.	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter main string : ");
		String word1 = sc.next();
		System.out.println("Enter rotated string : ");
		String word2 = sc.next();
		String word3 = word1 + word1;									// Concatenates word1 with itself and checks for word2 in it.
		if(word3.contains(word2)) System.out.println(word2+" is Rotation of "+word1);
		else System.out.println(word2+" is Not rotation of "+word1);
		sc.close();
	}
}
