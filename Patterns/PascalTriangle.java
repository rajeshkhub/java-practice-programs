import java.util.Scanner;
public class PascalTrangle {
	public static void main(String[] args) {
		// Pascal Triangle pattern.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();
		sc.close();
    int[] prev = null;
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height-i; j++) {
				System.out.print(" ");
			}
			int[] current = new int[i];
			for(int j = 1; j <= i; j++) {
				if(j == i || j == 1) current[j-1] = 1;
				else current[j-1] = prev[j-2]+prev[j-1];
				System.out.print(current[j-1]+" ");
			}
			prev = current;
			System.out.println();
		}
  }
}
