import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many terms :");
		int terms = sc.nextInt();
		sc.close();
		int num = 2;
		int first = 0;
		int second = 1;
		System.out.print("The fibonacci sequence : "+first+" "+second+" ");
		while(1 < num && num <= terms-1) {
			int temp =first+second;
			first = second;
			second = temp;
			System.out.print(temp+" ");
			num++;
		}
	}
}
