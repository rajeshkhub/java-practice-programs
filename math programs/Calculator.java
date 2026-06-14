import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		
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
		switch(choice) {
		case 1: System.out.println("Result : "+(num1+num2));
		break;
		case 2: System.out.println("Result : "+(num1-num2));
		break;
		case 3: System.out.println("Result : "+(num1*num2));
		break;
		case 4: System.out.println("Result : "+(num1/num2));
		break;
		case 5: System.out.println("Result : "+(num1%num2));
		break;
		}
		break;	 }
		catch(InputMismatchException w) {System.out.println("invalid input!");
		sc.next();}
		}
		sc.close();
	}
}
