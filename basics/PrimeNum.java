import java.util.*;
public class PrimeNum {
	public static void main(String[] args) {
		//Checks whether the number is prime number or not 
Scanner sc = new Scanner(System.in);
while(true) {try {
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	if(num <= 1) {
		System.out.println("Not a prime number.");
	}
	else{ boolean prime = true;
		for(int i = 2;i <= Math.sqrt(num);i++) {
			if(num % i == 0) { prime = false;
			break;}
		}
		if(prime) {System.out.println("The given numer "+num+" is :\n A Prime number");}
		else {System.out.println("The given number "+num+" is :\n Not a Prime number");}
		}
	break;}
catch(InputMismatchException e) {
	System.out.println("Invalid input!");
} 
sc.next();
}
sc.close();
}
}
