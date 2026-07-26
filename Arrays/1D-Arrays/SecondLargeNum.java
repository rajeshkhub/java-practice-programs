import java.util.*;
public class SecondLargeNum {
	public static void main(String[] args) {
																// Finds second largest number in the array but finding first largest number and removing it.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int array[] = new int[size];							// Assigning size to array.
		System.out.println("Enter array elements : ");
		for(int i = 0; i < size;i++) {							// For loop to insert input numbers into the array.
			array[i] = sc.nextInt();
		}
		sc.close();
																// Finding first maximum number
		int firstMax = array[0];
		for(int i = 0; i < array.length;i++) {
			if(array[i] > firstMax) {
				firstMax = array[i];
			}
		} 
																// Removing first maximum number from array
		for(int i = 0 ; i < array.length;i++) {
			if(array[i] == firstMax) {
				array[i] -= firstMax;
			}
		}
																// Finding current maximum number in the array
		int secondMax = array[0];
		for(int i = 0 ; i < array.length;i++) {
			if(array[i] > secondMax) {
				secondMax = array[i];
			}
		}
		System.out.println("The second largest number is : "+secondMax);
	}
}
