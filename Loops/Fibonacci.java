import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
																					// Gives n number of Fibonacci series number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many terms :");
		int terms = sc.nextInt();
		sc.close();
		int first = 0;
		int second = 1;
		if(terms == 0) System.out.print("No terms to display.");					
		else if(terms == 1) System.out.print("The fibonacci sequence : "+first);
																					// Using while loop.
		/*else{
		System.out.print("The fibonacci sequence : ");
		while(terms > 0) {       
			System.out.print(first+" ");
			int temp = first + second;
			first = second;
			second = temp;
			terms--;
		}
		}*/
																					// Using For loop.
		else { 
			System.out.print("The fibonacci sequence : ");
			for(int i = 1; i <= terms; i++) {
			System.out.print(first+" ");
			int temp = first + second;
			first = second;
			second = temp;
			}
		}
	}
}
