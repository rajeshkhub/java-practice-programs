import java.util.*;
import java.util.InputMismatchException;
public class SwapingNum {
	public static void main(String[] args) {
																					// Swaps two numbers using a temporary variable or by calculation.
		Scanner sc = new Scanner(System.in);
		while(true) {																// While loop controls continuation of program.
			try {																	// Try block to throw exceptions.
				System.out.print("Enter your first number : ");
				int num1 = sc.nextInt();
				System.out.print("Now enter your second number : ");
				int num2 = sc.nextInt();
				System.out.println("(Swapping the numbers...)");
																					// Using third variable (temp).
				int temp = num1;
				num1 = num2;
				num2 = temp;
																					// Without using third variable.
				//num1 += num2;
				//num2 = num1 - num2;
				//num1 = num1 - num2;
				
				System.out.println("After swapping\nFirst number is : "+num1+"\nSecond number is : "+num2);
				System.out.println("Do you want to continue ? (yes/no)");
				String answer = sc.next();
				if(answer.equalsIgnoreCase("yes")) System.out.println("Okay");
				else {
					System.out.println("Thank you");
					break;
				}
			}
			catch(InputMismatchException e) {										// Catch block to handle exceptions.
				System.out.println("Invalid input!");
				sc.next();
			}
		}
		sc.close();
	}
}
