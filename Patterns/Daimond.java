import java.util.Scanner;
public class Daimond {
	public static void main(String[] args) {
																// Daimond pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height : ");
		int height = sc.nextInt();								// Height is equals to number of rows of pattern.
		sc.close();
		int mid = (height+1)/2;									// Mid of the height.
		
		for(int i = 1; i <= height; i++) {						// Outer/row loop for height of the pattern.
			int level;											// For number of iterations of the inner loops.
			if(i <= mid) level = i;
			else level = height - (i - 1);
			
			for(int j = height-level; j >= mid; j--) {			// First inner loop for spaces.
				System.out.print(" ");
			}
														
			for(int j = 1; j <= 2*level-1 ; j++) {				// Second inner loop to print "*".
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
