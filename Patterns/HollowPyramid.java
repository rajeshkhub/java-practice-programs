import java.util.Scanner;
public class HollowPyramid {
	public static void main(String[] args) {
    															// Hollow pyramid pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();								// Height of the pattern.
		sc.close();
		
		for(int i = 1; i <= height; i++) {						// Outer/row loop for height of the pattern.
			
			for(int j = 1; j <= height-i; j++) {				// First inner loop to print spaces.
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++) {					// Second inner loop.
				if(i == height || j == 1 || j == 2*i-1) System.out.print("*");  // Prints "*" if condition becomes true.
				else System.out.print(" ");						// Prints spaces if condition becomes false.
			}
			System.out.println();
		}
	}
}
