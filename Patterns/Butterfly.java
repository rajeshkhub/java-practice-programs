import java.util.Scanner;
public class Butterfly {
	public static void main(String[] args) {
//Butterfly pattern
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height :");
		int height = sc.nextInt();
		sc.close();
    int mid = (height+1)/2;
		for(int i = 1; i <= height; i++) {
			int level;
			if(i <= mid) level = i;
			else level = height - (i-1);
			for(int j = 1; j <= level; j++) {
				System.out.print("*");
			}
			for(int j = 0; j <= height-(2*level); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= level; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
