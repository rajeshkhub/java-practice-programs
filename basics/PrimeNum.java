import java.util.*;
public class PrimeNum {
	public static void main(String[] args) {
																							// Checks whether the number is prime number or not.
		Scanner sc = new Scanner(System.in);
		while(true) {																		// While loop to control the continuation of program.
			try {																			// Try block throws if any exception occurs.
				System.out.println("Enter a number : ");
				int num = sc.nextInt();
				if(num <= 1) System.out.println("Not a prime number.");						// Handles if num <= 1.
				else{
					boolean prime = true;								
					for(int i = 2; i <= Math.sqrt(num); i++) {								// for loop, i starts from 2 to square root of num.
						if(num % i == 0) {													// Checks if num divide by i gives 0 reminder.
							prime = false;													// if num is divisible by any i value boolean prime will be false.
							break;
						}
					}
					String result = (prime)? "Prime number" : "Not a prime number";			// Terinary operator for string result.
					System.out.println("The given number "+num+" is :\n"+result);
				}
				break;
			}
			catch(InputMismatchException e) {												// Catch block handles the exception.
				System.out.println("Invalid input!");
			}
			sc.next();
		}
		sc.close();
	}
}
