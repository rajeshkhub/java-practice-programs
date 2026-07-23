import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
															// Reverse Array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];							// Size of the array.
		System.out.println("Enter array elements: ");
		
		for(int i = 0; i < arr.length; i++) {				// for loop to insert inputs into array.
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length/2; i++) {				// for loop to iterate over array.
			int element = arr[i];							// Temporary variable to store array element of index i.
			arr[i] = arr[arr.length-1-i];					// Stores last element of array by replacing the element of index i.
			arr[arr.length-1-i] = element;					// Last element of array is replaced by the element which is stored inside the variable.
		}
		System.out.println("Reversed array: "+Arrays.toString(arr));			// Array is converted into string while printing the output.
		sc.close();
	}
}
