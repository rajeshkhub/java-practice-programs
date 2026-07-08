import java.util.Scanner;
public class PalindromeNum {
	public static void main(String[] args) {
																		// Finds whether the given number is Palindrome number or not by reversing the number using while loop.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int reverse = 0;
		sc.close();
		while(num > 0) {												//While loop.
			int digit = num % 10;										//Derives reminder of the num which is last digit of the number.
			reverse = reverse * 10 + digit;								//Storing the last digit in reverse by multiplying the reverse with 10 and adding digit to it.
			num /= 10;													//num divided by 10 which removes the last digit of num.
		}
		String result = (temp == reverse) ? "a Palindrome" : "not a Palindrome";	//Terinary operator for String result.
		System.out.println("Given number is "+result);
	}
}
