import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		// Calculates two numbers using arithmetic operators.
		Scanner sc = new Scanner(System.in);
		while(true) {try {System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int choice;
		while(true) {
		System.out.println("Choose your option : \n1. Addition \n2. Difference \n3. Multiplication \n4. Division \n5. Reminder");
		choice = sc.nextInt();
		if(choice >= 1 && choice <= 5) {break;}
		else {System.out.println("Invalid input!");}
		}
		int result = 0;
		switch(choice) {
		case 1: result = num1+num2;
		break;
		case 2: result = num1-num2;
		break;
		case 3: result = num1*num2;
		break;
		case 4: result = num1/num2;
		break;
		case 5: result = num1%num2;
		break;
		}
		System.out.println("Result : "+result);
		break;	 }
		catch(InputMismatchException w) {System.out.println("invalid input!");
		sc.next();}
		}
		sc.close();
	}
}
