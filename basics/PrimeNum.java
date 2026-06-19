package ippo;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
while(true) {try {
	System.out.println("Enter a number : ");
	int a = sc.nextInt();
	if(a<=1) {
		System.out.println("Not a prime number.");}
	else{ boolean prime = true;
		for(int i =2;i<=Math.sqrt(a);i++) {
			if(a%i==0) { prime = false;
			break;}}
		if(prime) {System.out.println("The given numer "+a+" is :\n A Prime number");}
		else {System.out.println("The given number "+a+" is :\n Not a Prime number");}}
	break;}
catch(InputMismatchException e) {
	System.out.println("Invalid input!");
} sc.next();}
sc.close();
}
	}