import java.util.*;
public class SecondSmallNum {
	public static void main(String[] args) {
																		// Second smallest element.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];										// size of the array.
		System.out.println("Enter array elements: ");
		
		for(int i = 0; i < arr.length; i++) {							// for loop to insert inputs into array.
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];											// Assuming the first element is the smallest.
		int secSmallest = Integer.MAX_VALUE;							// Using max value of int as second smallest for better comparison.
		
		for(int i = 1; i < arr.length; i++) {							// for loop to iterate over array.
			if(arr[i] < smallest) {										// Checks if element of array at index i is smaller than smallest.
				secSmallest = smallest;									// if above condition is true then smallest will be stored in second smallest.
				smallest = arr[i];										// And element at i index will be stored in smallest.
			}
			else if(arr[i] < secSmallest && smallest != arr[i]) {		// else if checks the element is smaller than second smallest and smallest is not equal to element.
				secSmallest = arr[i];									// if above condition is true then element is stored in second smallest.
			}
		}
		System.out.println("Second smallest number: "+secSmallest);
		sc.close();
	}
}
