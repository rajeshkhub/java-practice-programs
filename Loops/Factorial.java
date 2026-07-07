import java.util.*;
public class Factorial {
	public static void main(String[] args) {
																		// Returns factorial of a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		if(num <= 1) {
			System.out.println("The factorial of "+num+" is : 1");
		}
		int num1 = 1;
																		//Using While loop.
		/*int num2 = num;
		while(num > 0) {
		 num1 *= num;
		 num--;
		}
		System.out.println("The factorial of "+num2+" is : "+num1);
		*/
																		//Using For loop.
		for(int i = num; i > 1; i--) {
			num1 *= i;
		}
		System.out.println("The factorial of "+num+" is : "+num1);
	}
}
