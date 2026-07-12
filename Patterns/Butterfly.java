import java.util.Scanner;
public class Butterfly {
	public static void main(String[] args) {
																	// Butterfly pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();									// In this program height is equals to number of rows of pattern.
		sc.close();
		int mid = (height+1)/2;										// Mid of height is found to form perfect pattern.
		
		for(int i = 1; i <= height; i++) {							// Outer/row Loop for height of the pattern.
			int level;												// Inner loops depends on variable "level" for number of iterations.
			if(i <= mid) level = i;
			else level = height - i+1;
	
			for(int j = 1; j <= level; j++) {						// First inner loop to print left side "*".	
				System.out.print("*");
			}
			
			for(int j = 0; j <= height-(2*level); j++) {			// Second inner loop for spaces.
				System.out.print(" ");
			}
			
			for(int j = 1; j <= level; j++) {						// Third inner loop for right side "*".
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
