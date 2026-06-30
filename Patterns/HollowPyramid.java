import java.util.Scanner;
public class HollowPyramid {
	public static void main(String[] args) {
    // Prints Hollow pyramid.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();
		sc.close();
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				if(i != 1 && i != height && j != 1 && j != 2*i-1) {
						System.out.print(" ");
				}
				else System.out.print("*");
			}
			System.out.println();
		}
