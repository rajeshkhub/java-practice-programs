import java.util.*;
public class LargestNum {
	public static void main(String[] args) {
																									// Finds largest/ maximum number in three numbers.
           Scanner sc = new Scanner(System.in);
           while(true) {																			// While loop to continue program.
			   try { 																				// Try block throws exception.
				   System.out.println("Enter three numbers : ");
				   int num1 = sc.nextInt();
				   int num2 = sc.nextInt();
				   int num3 = sc.nextInt();
				   if(num1 > num2 && num1 > num3) System.out.println("The largest number among them is : "+num1);
				   else if(num2 > num3) System.out.println("The largest number among them is : "+num2);
				   else if(num1 == num2 && num2 == num3) System.out.println("All numbers are equal.");
				   else System.out.println("The largest number among them is : "+num3);
				   break;
			   }
			   catch(InputMismatchException e) { 													// Catch block to handle exception.
				   System.out.println("Invalid input!");
				   sc.next();
			   }
		   }
		sc.close();
	}
}
