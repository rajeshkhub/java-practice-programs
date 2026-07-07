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
		if(terms == 1){
			System.out.print("The fibonacci sequence : "+first);					
		}
		else System.out.print("The fibonacci sequence : "+first+" "+second+" ");
																					//Using while loop.
		/*int num = 2;
		while(num <= terms-1) {       												
			int temp = first + second;
			first = second;
			second = temp;
			System.out.print(temp+" ");
			num++;
		}*/
																					//Using For loop.
		System.out.print(first+" "+second);
		for(int i = 1; i <= terms; i++) {
			int temp = first + second;
			System.out.print(" "+temp);
			first = second;
			second = temp;
		}
	}
}
