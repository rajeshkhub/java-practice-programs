package ippo;
import java.util.*;
public class PalindromeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int num2 = 0;
		sc.close();
		while(num > 0) {
			int num3 = num % 10;
			num2 = num2 * 10 + num3;
			num /= 10;
		}
		String result = (temp == num2) ? "a Palindrome" : "not a Palindrome";
		System.out.println("Given number is "+result);
		
	}

}
