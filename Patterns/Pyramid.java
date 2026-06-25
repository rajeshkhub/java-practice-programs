import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		//Pyramid pattern
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pyramid height : ");
		int height = sc.nextInt();
		sc.close();
		for(int i = 1; i <= height; i++) {             //Outer loop
			for(int j = 1; j <= height-i; j++) {       //Space loop
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++) {          //Star loop
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
