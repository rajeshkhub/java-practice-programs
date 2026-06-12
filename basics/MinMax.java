import java.util.*;
public class MinMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter your elements.");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Your array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		while(true) {
			System.out.println("\nChoose your option : \n1. Maximum element \n2. Minimum element");
			int choice = sc.nextInt();
			if(choice == 1) { int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max =arr[i];
				}
			}
			System.out.println("\nMax of the array : "+max); break;}
			else if(choice == 2) {int min=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					min =arr[i];
				}
			}
			System.out.println("\nMin of the array : "+min); break;}
			else {System.out.println("Invalid input!");}
		}
		sc.close();
	}
}
