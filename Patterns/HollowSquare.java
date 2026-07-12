import java.util.Scanner;
public class HollowSquare {
	public static void main(String[] args) {
    																	// Hollow Square pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();										// Height of the pattern.
		sc.close();
		
		for(int i = 1; i <= height; i++) {								// Outer/row loop for height of pattern.
			
			for(int j = 1; j <= height; j++) {							// Inner/column loop to print stars and spaces. 
				if(i == 1 || i == height || j == 1 || j == height) System.out.print("*");	// If condition is true prints stars.
				else System.out.print(" ");								// If condition is false then prints spaces.
			}
			System.out.println();
		}
    }
}
