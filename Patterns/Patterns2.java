package testt;
import java.util.Scanner;
public class Patterns2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pyramid height : ");
		int height = sc.nextInt();
		sc.close();
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}