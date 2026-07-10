import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
															// Gives output of Sum of all digits in a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
															// Using While loop.
		while(num > 0) {
			sum += num % 10;								// Digit derived by num modulo 10 is added to sum.
			num /= 10;										// num divided by 10 removes the last digit.
		}
		System.out.println("Sum of digits : "+sum);
		sc.close();
	}
}
