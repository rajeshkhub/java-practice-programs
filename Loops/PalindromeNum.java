import java.util.*;
public class PalindromeNum {

	public static void main(String[] args) {
		
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
