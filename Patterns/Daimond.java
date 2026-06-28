import java.util.Scanner;
public class Daimond {
	public static void main(String[] args) {
		// Generates Daimond shaped pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height : ");
		int height = sc.nextInt();
		sc.close();
		int mid = (height+1)/2;
		
		for(int i = 1; i <= height; i++) {
			int level;
			if(i <= mid) {
				level = i;
			}
			else level = height - (i - 1);
			// Space loop
			for(int j = height-level; j >= mid; j--) {
				System.out.print(" ");
			}
			// Star loop
			for(int j = 1; j <= 2*level-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}

}
