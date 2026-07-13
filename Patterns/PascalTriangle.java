import java.util.Scanner;
public class PascalTrangle {
	public static void main(String[] args) {
																	// Pascal Triangle pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();									// Height of the pattern.
		sc.close();
		int[] previous = null;										// Integer array (previous) to store previous row numbers. 
		
		for(int i = 1; i <= height; i++) {							// Outer/row loop for pattern height.
			
			for(int j = 1; j <= height-i; j++) {					// First inner loop to print spaces.
				System.out.print(" ");
			}
			int[] current = new int[i];								// Integer array (current) to print current row elements.
			
			for(int j = 1; j <= i; j++) {							// Second inner loop to print numbers.
				if(j == i || j == 1) current[j-1] = 1;				// if condition is true then "1" is inserted into current array.
				else current[j-1] = previous[j-2]+previous[j-1];	// else previous array elements at index will be added and inserted into the current array.
				System.out.print(current[j-1]+" ");
			}
			previous = current;										// previous array points to current array elements.
			System.out.println();
		}
	}
}
