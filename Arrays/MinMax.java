import java.util.*;
public class MinMax {
	public static void main(String[] args) {
		// Finds Minimum and Maximum numbers in array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter your elements.");
		for(int i = 0; i < size ; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Your array elements are : ");
		for(int i = 0; i < array.length ;i++) {
			System.out.print(array[i]+" ");
		}
		while(true) {
			System.out.println("\nChoose your option : \n1. Maximum element \n2. Minimum element");
			//MAX
			int choice = sc.nextInt();
			if(choice == 1) { int max = array[0];
			for(int i = 0; i < array.length;i++) {
				if(array[i] > max) {
					max = array[i];
				}
			}
			System.out.println("\nMax of the array : "+max); break;}
				//MIN
			else if(choice == 2) {int min = array[0];
			for(int i = 0 ; i < array.length ;i++) {
				if(array[i] < min) {
					min = array[i];
				}
			}
			System.out.println("\nMin of the array : "+min); break;}
			else {System.out.println("Invalid input!");}
		}
		sc.close();
	}
}
