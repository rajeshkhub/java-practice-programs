import java.util.*;
public class PalindromeNum {
	public static void main(String[] args) {
		// Finds whether the given number is Palindrome number or not by reversing the number using while loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int reverse = 0;
		sc.close();
		while(num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		String result = (temp == reverse) ? "a Palindrome" : "not a Palindrome";
		System.out.println("Given number is "+result);
	}
}
