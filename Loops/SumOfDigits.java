import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
															// Gives output of Sum of all digits in a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
															//Using While loop.
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("Sum of digits : "+sum);
		sc.close();
	}
}
