import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
																//Pyramid pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pyramid height : ");
		int height = sc.nextInt();								// Height of the pattern.
		sc.close();
		
		for(int i = 1; i <= height; i++) {						// Outer/row loop for pattern height.
			
			for(int j = i; j < height-1; j++) {       			// First inner loop to print spaces.
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++) {          			// Second inner loop to print stars.
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
