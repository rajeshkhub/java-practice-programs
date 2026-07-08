import java.util.*;
public class Calculator {
	public static void main(String[] args) {
																								// Calculates two numbers using arithmetic operators.
		Scanner sc = new Scanner(System.in);
		while(true) {																			//While loop to continue calculation.
			try {																				//Try block.
				System.out.println("Enter two numbers : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int choice;
				while(true) {																	//While loop to run again if input choice is invalid.
					System.out.println("Choose your option : \n1. Addition \n2. Difference \n3. Multiplication \n4. Division \n5. Reminder");
					choice = sc.nextInt();
					if(choice >= 1 && choice <= 5) break;										//checks if input is valid or not.
					else System.out.println("Invalid input!");
				}
				int result = 0;
				switch(choice) {																//Switch case.
					case 1: result = num1 + num2;												//Addition.
						break;
					case 2: result = num1 - num2;												//Difference.
						break;
					case 3: result = num1 * num2;												//Multiplication.
						break;
					case 4: result = num1 / num2;												//Division.
						break;
					case 5: result = num1 % num2;												//Modulo.
						break;
				}
				System.out.println("Result : "+result);
				break;
			}
			catch(InputMismatchException m) {													//catch block to catch exception.		
				System.out.println("Invalid input!");
				sc.next();
			}
		}
		sc.close();
	}
}
