import java.util.Scanner;
public class InvertedPyramid {
	public static void main(String[] args) {
//Prints inverted pyramid for the given height.
Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
int height = sc.nextInt();
sc.close();
		for(int i = 1; i <= height; i++) {
			//space loop
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			//star loop
			for(int j = i; j <= 2*height-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
