import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
																					// Gives n number of Fibonacci series number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many terms :");
		int terms = sc.nextInt();
		sc.close();
		int num = 2;
		int first = 0;
		int second = 1;
		if(terms == 1){
			System.out.print("The fibonacci sequence : "+first);					
		}
		else System.out.print("The fibonacci sequence : "+first+" "+second+" ");
		while(num <= terms-1) {       												//Using while loop.
			int temp = first + second;
			first = second;
			second = temp;
			System.out.print(temp+" ");
			num++;
		}
	}
}
