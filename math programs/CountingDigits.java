import java.util.*;
public class CountingDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		// using string method
		/*
		 * String a = sc.next();
		 * System.out.println("Number of digits in the number are : "+a.length());
		 */
		sc.close();
		int length = String.valueOf(num).length();
		System.out.println("No.of digits : "+length);
	}
}
