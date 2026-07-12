import java.util.Scanner;
public class InvertedPyramid {
	public static void main(String[] args) {
															// Inverted pyramid pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();							// Height of the pyramid.
		sc.close();
		
		for(int i = height; i > 0; i--) {					// Outer/row loop for height of the pattern.
			
			for(int j = i; j < height-1; j++) {				// First inner loop to print spaces.
				System.out.print(" ");
			}
		
			for(int j = 1; j <= 2*i-1; j++) {				// Second inner loop to print stars.
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
